# <img src="https://cdn.svgporn.com/logos/uservoice.svg" height="40"> Contributing to `git-osp-for-beginners`


For starters, you could help in improving the sections in this document by either creating a new issue describing the improvement or submitting a pull request to this repository. 

* If you are a first-time contributor, please see [Steps to Contribute](#steps-to-contribute).

* If you would like to suggest new programs to be added to the repository, please go ahead and [create a new issue](https://github.com/aditya109/git-osp-for-beginners/issues/new?assignees=&labels=Hacktoberfest%2C+good+first+issue&template=programming-question.md&title=%5BQuestion%5D) describing your test. All you need to do is specify the Question's explanation and the mention the language you would want to solve it in.

  

## Steps to Contribute :

* Find an issue to work on or create a new issue. You can pick up from a list of [active-issues](https://github.com/aditya109/git-osp-for-beginners/issues).
* Claim your issue by commenting your intent to work on it to avoid duplication of efforts. 
* Fork the repository on GitHub.
* Create a branch from where you want to base your work (usually master).
* Make your changes.
* Commit your changes by making sure the commit messages convey the need and notes about the commit.
* Push your changes to the branch in your fork of the repository.
* Submit a pull request to the original repository. See [Pull Request checklist](#pull-request-checklist)


## Pull Request Checklist :
* Rebase to the current master branch before submitting your pull request.
* Commits should be as small as possible. Each commit should follow the checklist below:

  - For code changes, add tests relevant to the fixed bug or new feature
  - Pass the compile and tests - includes spell checks, formatting, etc
  - Commit header (first line) should convey what changed.
  

## Sign your work 

Please add a line to every git commit message:

```
  Signed-off-by: Random J Developer <random@developer.example.org>
```

Use your real name (sorry, no pseudonyms or anonymous contributions). The email id should match the email id provided in your GitHub profile. 
If you set your `user.name` and `user.email` in git config, you can sign your commit automatically with `git commit -s`. 

You can also use git [aliases](https://git-scm.com/book/tr/v2/Git-Basics-Git-Aliases) like `git config --global alias.ci 'commit -s'`. Now you can commit with `git ci` and the commit will be signed.