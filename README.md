# quickstart-react-native

A quick start guide for react native mobile apps using react-native-cli



### Pre-requisites

- Nodejs
- Java
- Android Studio

Also make sure all these path are setup properly

To install react-native-cli then execute the following command in the cmd

`npm install –g react-native-cli`

This will install react-native-cli globally

React Native has a built-in command line interface. Rather than install and manage a specific version of the CLI globally, we recommend you access the current version at runtime using `npx`, which ships with Node.js. With `npx react-native `, the current stable version of the CLI will be downloaded and executed at the time the command is run.

### Running quickstart-kit

Download the quickstart-kit from this repository.

Execute the following commands: 

```
npm install
cd android
./gradlew clean
cd ..
react-native run-android
```



### Creating a new application from scratch 

`npx react-native init Projectname`



### Start the application

Let Metro Bundler run in its own terminal. Open a new terminal inside your React Native project folder. Run the following:

`npx react-native run-android`