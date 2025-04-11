# CLI

- Command line interface
- File
- Directory (folder)
- Windows: Power Shell, Command Prompt, Git Bash
- MacOS: Terminal
- `pwd`= print working directory | where you are currently
- command line flags (arguments, switches)
  - can pass flags to the commands
  - flags start with `-` or `--`
  - `-` short, one letter Ex. `-l`
  - `--` verbose, whole word Ex. `--list`
- `ls` = list
  - `-l` = long list
  - `-a` = all | view hidden files and directories
- up arrow is your friend, gets you previous commands
- `cd` = change directory
  - `cd ~` = change directory to home
  - `cd dogs` = change directory to dogs
  - `cd ..` = move up one directory
  - `cd ../..` = move up two directories
- `~` = home directory
- `mkdir` = make directory
- `rm` = remove file or directory
- `rmdir` - remove directory
- `cd c:` or `cd /c/` - change directory to the root of the file system
- `touch [filename]` - create a file
- `cp [source] [destination]` - copy file or directory
- `mv [source] [destination]` - move/rename file or directory
- `cat [filename]` - displays file contents

<br/>

# GIT

- SCM - Source Control Management
- CVC - Centralized Version Control
  - there is one central copy of the repository (database)
  - lock each file and then check back into central repo
- DVC - Distributed Version Control
  - everyone has a copy of the repository (database)
  - the entire repository is being synched with the central copy
- version control for your code
- `git config` - sets/gets configuration options from configuration file for example, - `user.email, user.name`
  - `-- global` - use home/user directory config that applies to all projects
  - `--list` - lists all your current settings
    - `git --global --list` - lists all your global settings
- `git init` - initializes a repository in your current directory
  - adds a `.git` folder

![git add commands](image.png)

## Create Repository on Github

1. github.com
1. new repo
1. make it public
1. name the repo (lowercase, dasherized)
1. include readme
1. include .gitignore for Java
1. click create

## Clone Repository to Local Computer

1. open terminal
1. cd to where you want to put the repo
1. github.com click code to get [repo url]
1. git clone [repo url]
1. cd into the repo directory/folder

## Create Java Project

1. Open IntelliJ
2. Choose name
3. Choose location (workbook-x)
4. Uncheck create repository
5. Build System: Maven
6. JDK: Amazon Corretto 17
7. Uncheck add sample code
8. Advanced Settings: GroupId: com.companyname ArtifactId:project name
