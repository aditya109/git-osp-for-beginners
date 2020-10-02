# CRUD REST API Server

Create a simple REST API Server with the following endpoints:

- [ ] POST `/create/user` - to create a user
- [ ] PUT `/modify/user/{id}` - to modify an existing user
- [ ] DELETE `/delete/user/{id}` - to delete an existing user
- [ ] GET `/show/users` 	- to show all users
- [ ] GET `/show/user/{id}` - to show a particular user 

Data Model :
- `_id`
- `index`
- `guid`
- `isActive`
- `balance`
- `picture`
- `age`
- `eyeColor`
- `name`
- `gender`
- `company`
- `email`
- `phone`
- `address`
- `about`
- `registered`
- `latitude`
- `longitude`
- `tags`

User Sample:
```
  {
    "_id": "5f771559270059c67aba988b",
    "index": 0,
    "guid": "59639268-9029-47f4-b035-a4ec3ad2a402",
    "isActive": true,
    "balance": "$2,383.90",
    "picture": "http://placehold.it/32x32",
    "age": 37,
    "eyeColor": "blue",
    "name": "Harrell Gaines",
    "gender": "male",
    "company": "COMTOURS",
    "email": "harrellgaines@comtours.com",
    "phone": "+1 (836) 430-2081",
    "address": "189 Provost Street, Lopezo, North Dakota, 358",
    "about": "Incididunt consequat ullamco cillum elit nisi excepteur laboris ea. Aliqua elit eiusmod exercitation tempor occaecat fugiat consequat proident deserunt voluptate consequat enim amet officia. Ut occaecat enim officia quis qui reprehenderit labore nisi consequat reprehenderit amet. Esse exercitation laborum excepteur ullamco. Consequat excepteur sunt dolor aliqua eu Lorem ad. Veniam do dolor do commodo anim laborum proident Lorem irure magna.\r\n",
    "registered": "2016-03-13T12:27:14 -06:-30",
    "latitude": -46.305726,
    "longitude": -101.855307,
    "tags": [
      "est",
      "magna",
      "aliquip",
      "ex",
      "laboris",
      "sunt",
      "quis"
    ]
  }
```

Host this Server on free platform like `Heroku` or `Firebase` or `Netlify` to demo its usage.

With ❤ from India