{
 "cells": [
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "## Classifying Passwords Strength With Machine Learning in Python"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 1,
   "metadata": {},
   "outputs": [],
   "source": [
    "# EDA Packages\n",
    "import pandas as pd\n",
    "import numpy as np\n",
    "import random\n",
    "\n",
    "\n",
    "# Machine Learning Packages\n",
    "from sklearn.feature_extraction.text import CountVectorizer\n",
    "from sklearn.feature_extraction.text import TfidfVectorizer\n",
    "from sklearn.linear_model import LogisticRegression\n",
    "from sklearn.model_selection import train_test_split"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 2,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Load Passwordlist\n",
    "# Credits Faizan\n",
    "#pswd_data = pd.read_csv(\"passwordsdata.csv\",error_bad_lines=False)\n",
    "pswd_data = pd.read_csv(\"cleanpasswordlist.csv\")"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 3,
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/html": [
       "<div>\n",
       "<style>\n",
       "    .dataframe thead tr:only-child th {\n",
       "        text-align: right;\n",
       "    }\n",
       "\n",
       "    .dataframe thead th {\n",
       "        text-align: left;\n",
       "    }\n",
       "\n",
       "    .dataframe tbody tr th {\n",
       "        vertical-align: top;\n",
       "    }\n",
       "</style>\n",
       "<table border=\"1\" class=\"dataframe\">\n",
       "  <thead>\n",
       "    <tr style=\"text-align: right;\">\n",
       "      <th></th>\n",
       "      <th>Unnamed: 0</th>\n",
       "      <th>password</th>\n",
       "      <th>strength</th>\n",
       "    </tr>\n",
       "  </thead>\n",
       "  <tbody>\n",
       "    <tr>\n",
       "      <th>0</th>\n",
       "      <td>0</td>\n",
       "      <td>kzde5577</td>\n",
       "      <td>1</td>\n",
       "    </tr>\n",
       "    <tr>\n",
       "      <th>1</th>\n",
       "      <td>1</td>\n",
       "      <td>kino3434</td>\n",
       "      <td>1</td>\n",
       "    </tr>\n",
       "    <tr>\n",
       "      <th>2</th>\n",
       "      <td>2</td>\n",
       "      <td>visi7k1yr</td>\n",
       "      <td>1</td>\n",
       "    </tr>\n",
       "    <tr>\n",
       "      <th>3</th>\n",
       "      <td>3</td>\n",
       "      <td>megzy123</td>\n",
       "      <td>1</td>\n",
       "    </tr>\n",
       "    <tr>\n",
       "      <th>4</th>\n",
       "      <td>4</td>\n",
       "      <td>lamborghin1</td>\n",
       "      <td>1</td>\n",
       "    </tr>\n",
       "  </tbody>\n",
       "</table>\n",
       "</div>"
      ],
      "text/plain": [
       "   Unnamed: 0     password  strength\n",
       "0           0     kzde5577         1\n",
       "1           1     kino3434         1\n",
       "2           2    visi7k1yr         1\n",
       "3           3     megzy123         1\n",
       "4           4  lamborghin1         1"
      ]
     },
     "execution_count": 3,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "pswd_data.head()"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 4,
   "metadata": {},
   "outputs": [],
   "source": [
    "pswd = np.array(pswd_data)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  },
  {
   "cell_type": "code",
   "execution_count": 5,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Shuffle data \n",
    "random.shuffle(pswd)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 6,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Grouping our data into features and labels\n",
    "# y = labels\n",
    "ylabels  = [s[2] for s in pswd]\n",
    "allpasswords = [s[1] for s in pswd]"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 7,
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/plain": [
       "669425"
      ]
     },
     "execution_count": 7,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "ylabels\n",
    "len(ylabels)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 8,
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/plain": [
       "669425"
      ]
     },
     "execution_count": 8,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "len(allpasswords)"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "### Data Vectorization Using TfidVectorizer\n",
    "#### Create A tokenizer\n",
    " + Use either the entire password\n",
    " + Use each character"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 9,
   "metadata": {},
   "outputs": [],
   "source": [
    "def makeTokens(f):\n",
    "    tokens = []\n",
    "    for i in f:\n",
    "        tokens.append(i)\n",
    "    return tokens"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 10,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Using Default Tokenizer\n",
    "#vectorizer = TfidfVectorizer()\n",
    "\n",
    "# Using Custom Tokenizer\n",
    "vectorizer = TfidfVectorizer(tokenizer=makeTokens)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 11,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Store vectors into X variable as Our X allpasswords\n",
    "X = vectorizer.fit_transform(allpasswords)"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "##### Splitting Data Into Train and Test at 80/20"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 12,
   "metadata": {},
   "outputs": [],
   "source": [
    "X_train, X_test, y_train, y_test = train_test_split(X, ylabels, test_size=0.2, random_state=42)\t"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  },
  {
   "cell_type": "code",
   "execution_count": 13,
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/plain": [
       "LogisticRegression(C=1.0, class_weight=None, dual=False, fit_intercept=True,\n",
       "          intercept_scaling=1, max_iter=100, multi_class='ovr', n_jobs=1,\n",
       "          penalty='l2', random_state=None, solver='liblinear', tol=0.0001,\n",
       "          verbose=0, warm_start=False)"
      ]
     },
     "execution_count": 13,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "# Model Building\n",
    "#using logistic regression\n",
    "# Multi_class for fast algorithm\n",
    "logit = LogisticRegression(penalty='l2',multi_class='ovr')\t\n",
    "logit.fit(X_train, y_train)\n"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "#### Accuracy of Our Model"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 14,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Accuracy : 0.811263397692\n"
     ]
    }
   ],
   "source": [
    "print(\"Accuracy :\",logit.score(X_test, y_test))"
   ]
  },
  {
   "cell_type": "markdown",
   "metadata": {},
   "source": [
    "#### Predicting With Our Model"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 15,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[0 2 0 2 0 1 1 0]\n"
     ]
    }
   ],
   "source": [
    "X_predict = ['password',\n",
    "             'pYthon'\n",
    "             'faizanahmad',\n",
    "             'password##',\n",
    "             'ajd1348#28t**',\n",
    "             'ffffffffff',\n",
    "             'kuiqwasdi',\n",
    "             '123456',\n",
    "             'abcdef']\n",
    "\n",
    "X_predict = vectorizer.transform(X_predict)\n",
    "y_Predict = logit.predict(X_predict)\n",
    "print(y_Predict)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 16,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[1 1 2 1 1 1 1 1]\n"
     ]
    }
   ],
   "source": [
    "# http://www.passwordmeter.com/\n",
    "# https://password.kaspersky.com/\n",
    "\n",
    "New_predict = [\"1qaz2wsx\",\n",
    "\"306187mn\",\n",
    "\"rados1#@1$#@$@$#@$\",\n",
    "\"newyork911\",\n",
    "\"abc123\",\n",
    "\"taqiyudin100587\",\n",
    "\"wjr5443\",\n",
    "\"nana0428\"]\n",
    "\n",
    "New_predict = vectorizer.transform(New_predict)\n",
    "y_Predict = logit.predict(New_predict)\n",
    "print(y_Predict)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": []
  },
  {
   "cell_type": "code",
   "execution_count": 17,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Using Default Tokenizer\n",
    "vectorizer = TfidfVectorizer()\n",
    "# Store vectors into X variable as Our X allpasswords\n",
    "X1 = vectorizer.fit_transform(allpasswords)\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 18,
   "metadata": {},
   "outputs": [],
   "source": [
    "X_train, X_test, y_train, y_test = train_test_split(X1, ylabels, test_size=0.2, random_state=42)\t"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 19,
   "metadata": {},
   "outputs": [
    {
     "data": {
      "text/plain": [
       "LogisticRegression(C=1.0, class_weight=None, dual=False, fit_intercept=True,\n",
       "          intercept_scaling=1, max_iter=100, multi_class='ovr', n_jobs=1,\n",
       "          penalty='l2', random_state=None, solver='liblinear', tol=0.0001,\n",
       "          verbose=0, warm_start=False)"
      ]
     },
     "execution_count": 19,
     "metadata": {},
     "output_type": "execute_result"
    }
   ],
   "source": [
    "# Model Building\n",
    "#using logistic regression\n",
    "# Multi_class for fast algorithm\n",
    "logit = LogisticRegression(penalty='l2',multi_class='ovr')\t\n",
    "logit.fit(X_train, y_train)\n"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 20,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "Accuracy : 0.776360309221\n"
     ]
    }
   ],
   "source": [
    "print(\"Accuracy :\",logit.score(X_test, y_test))"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "# Using th"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 21,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[1 1 1 1 1 1 1 1]\n"
     ]
    }
   ],
   "source": [
    "X_predict1 = ['password',\n",
    "             'pYthonqwas'\n",
    "             'faizanahmad',\n",
    "             'password##',\n",
    "             'ajd1348#28t**',\n",
    "             'ffffffffff',\n",
    "             'kuiqwasdi',\n",
    "             '123456',\n",
    "             'abcdef']\n",
    "\n",
    "X_predict1 = vectorizer.transform(X_predict1)\n",
    "y_Predict1 = logit.predict(X_predict1)\n",
    "print(y_Predict1)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": 22,
   "metadata": {},
   "outputs": [
    {
     "name": "stdout",
     "output_type": "stream",
     "text": [
      "[1 1 1 1 1 1 1 1]\n"
     ]
    }
   ],
   "source": [
    "New_predict2 = [\"1qaz2wsx\",\n",
    "\"306187mn\",\n",
    "\"rados1\",\n",
    "\"newyork911\",\n",
    "\"abc123\",\n",
    "\"taqiyudin100587\",\n",
    "\"wjr5443\",\n",
    "\"nana0428\"]\n",
    "\n",
    "New_predict2 = vectorizer.transform(New_predict2)\n",
    "y_Predict2 = logit.predict(New_predict2)\n",
    "print(y_Predict2)"
   ]
  },
  {
   "cell_type": "code",
   "execution_count": null,
   "metadata": {},
   "outputs": [],
   "source": [
    "#Thanks \n",
    "#J-Secur1ty\n",
    "#abhi Saves @abhi"
   ]
  }
 ],
 "metadata": {
  "kernelspec": {
   "display_name": "Python 3",
   "language": "python",
   "name": "python3"
  },
  "language_info": {
   "codemirror_mode": {
    "name": "ipython",
    "version": 3
   },
   "file_extension": ".py",
   "mimetype": "text/x-python",
   "name": "python",
   "nbconvert_exporter": "python",
   "pygments_lexer": "ipython3",
   "version": "3.6.3"
  }
 },
 "nbformat": 4,
 "nbformat_minor": 2
}
