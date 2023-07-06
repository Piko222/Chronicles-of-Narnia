# Chronicles-of-Narnia
Here is my written program so far for the Text-based Adventure Game: Chronicles of Narnia. 


## Built 
Entirely with Java


## Description
A Java Text-Based Adventure Game based on the Chronicles of Narnia: The Lion, the Witch, and the Wardrobe. This version allows the player to assume a character bearing a name of their choice and allows them to embark on an adventurous journey using their imagination, in saving Narnia from their treacherous foe, The White Witch. It is focused on reading and decision making, that is, players can observe that the storyline advances with every choice they make at the appointed time. Mainly for entertainment purposes, so feel free to notify me if you do not find it interesting enough. I am yet to finish the storyline. Please, do not be offended as I aim to do so as well as improve my code and create easier ways to play the game for all users than what is available at the moment.

## Getting Started

### Dependencies
* You will need a laptop with Operating System versions of Windows 10 or Ubuntu 20.04
* Download any IDE (Integrated Development Environment) of your choice that supports Java as a programming language. Highly recommended are Visual Studio Code Editor or Intellij IDEA. It is advised that they are up-to-date and compatible with your Windows 10 or Ubuntu 20.04 Operating Systems.

### Installing the IDE

#### For Intellij IDEA on Windows 10 (according to JetBrains, the manufacturers of Intellij IDEA)
* Download the Intellij installer for Windows which is in an .exe file.
* Run the installer and follow the wizard steps.
* On the Installation Options step, you can configure the following:

Create a desktop shortcut for launching IntelliJ IDEA.

Add the directory with IntelliJ IDEA command-line launchers to the PATH environment variable to be able to run them from any working directory in the Command Prompt.

Add the Open Folder as Project action to the system context menu (when you right-click a folder).

Associate specific file extensions with IntelliJ IDEA to open them with a double-click.
* To run IntelliJ IDEA, find it in the Windows Start menu or use the desktop shortcut.

#### Installing Intellij IDEA on Ubuntu 20.04 (according to LinuxConfig.org, verified by JetBrains)
* Start by opening a terminal window and execution of the below apt command. Select your preferred version to install running either of the commands on the terminal window:

$ sudo snap install intellij-idea-community --classic
OR

$ sudo snap install intellij-idea-ultimate --classic
OR

$ sudo snap install intellij-idea-educational --classic

And you're all done.
* To start Intellij IDEA, run one of below commands according to the version you have just installed on the terminal:

$ intellij-idea-community
OR

$ intellij-idea-ultimate
OR

$ intellij-idea-educational

#### Installing Visual Studio Code Editor on Windows 10 (according to Visual Studio, the manufacturers)
* Download the Visual Studio Code installer for Windows.
* Once it is downloaded, run the installer (VSCodeUserSetup-{version}.exe). This will only take a minute.
* By default, VS Code is installed under C:\Users\{Username}\AppData\Local\Programs\Microsoft VS Code.
* You can now run it.

#### Installing Visual Studio Code Editor on Ubuntu 20.04 (according to Visual Studio)
* The easiest way to install Visual Studio Code for Debian/Ubuntu based distributions is to download and install the .deb package (64-bit), either through the graphical software center if it's available, or through the command line or terminal with:

sudo apt install ./<file>.deb

If you're on an older Linux distribution, you will need to run this instead:

sudo dpkg -i <file>.deb

sudo apt-get install -f # Install dependencies

Installing the .deb package will automatically install the apt repository and signing key to enable auto-updating using the system's package manager. Alternatively, the repository and key can also be installed manually with the following script:

sudo apt-get install wget gpg
wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > packages.microsoft.gpg
sudo install -D -o root -g root -m 644 packages.microsoft.gpg /etc/apt/keyrings/packages.microsoft.gpg
sudo sh -c 'echo "deb [arch=amd64,arm64,armhf signed-by=/etc/apt/keyrings/packages.microsoft.gpg] https://packages.microsoft.com/repos/code stable main" > /etc/apt/sources.list.d/vscode.list'
rm -f packages.microsoft.gpg

Then update the package cache and install the package using:

sudo apt install apt-transport-https

sudo apt update

sudo apt install code # or code-insiders

And you're done!

### Executing the program/playing the game
To run the program/play the game, you will have to:
* Create a new project on your IDE.
* Open a Github account if you do not have one (To open a Github account, go to https://github.com/, type a username with your email address and a password, and choose "Sign up for Github, then follow the instructions).
* Type in "The Chronicles of Narnia" on the search bar of the Github website and select the one with the username "Piko222."
* Select the green button called "<>Code" and copy the https link for the program.
* Perform a git clone on your IDE in order to run the program on your IDE. To perform a git clone on Intellij, you should do one of the following:

1. If you are using Intellij, you can clone using Gitbash. First of all, click on the terminal

![Screenshot 2023-07-05 224105](https://github.com/Piko222/Chronicles-of-Narnia/assets/134336272/9c416288-77a2-4636-a096-d933dd46df6f)

2. Once you have opened the terminal, click on the following sign for the dropdown menu where you will see the options "Windows Powershell," "Command Prompt," and "Git Bash." If you wish to use the Git Bash in performing the git clone, then simply click it.

![Screenshot 2023-07-05 230106](https://github.com/Piko222/Chronicles-of-Narnia/assets/134336272/b4c7f661-fd3c-473a-8d86-7fc3ed856c9a)

3. After clicking Git Bash and opening it, just type "git clone" along with the https link you had earlier copied (remember to add the dollar sign before typing in "git clone" and the https link, just in case the dollar sign does not automatically appear after opening Git Bash)

4. After typing in "git clone" along with the https link, press the Enter key and allow it to run.

5. You can now find the program on your computer and run it in your IDE. Once you run it, you can play the game.

However, if you are using an IDE other than Intellij such as Visual Studio code Editor, click the link below and follow the instructions to perform a git clone on your IDE. Once you have it locally, you can run the program on your IDE and play the game.

Here's the link - https://www.geeksforgeeks.org/how-to-clone-a-project-from-github-using-vscode/

## Help

The program is still under improvement so please bear with me. Notify me in my email: pokorie31@gmail.com if you have any complaints or if you have feedbacks.

## Author
@Piko222

Precious Ifeoma Okorie
