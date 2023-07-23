# **MOBILE CODE CHALLENGE**

This is a project for the Android Developer position at ++++.

Here are all explanation about the code.

#### Arquitecture

This project is divide by modules:

* **App:** The main module for the application.
* **Core:** Contain the core part of the application. The modules here are:
  1- Navigation: Contain the interfaces that handle the navigation in the app
  2- Remote Data: Contain the configuration to access the api
  3- Design System: Contains everything releated to design system, as theme, colors and compose components.
  4- If we have a local storage, the configuration for the database whould be here as well.
* **Feature:** Contains all the features modules for the application. The modules here are
  1- Product: Contain all the classes to handle the product in the application

In this project, I am usigin MVVM, using corountine with flow to handle the state of the view.

#### LIBs

In this project the list of the libs that are being used are:

* Retrofit
* JetPack Compose
* Gson
* Corountines
* Mockk

#### TESTS

In this project, I am doing unit tests using Mockk. There is no instrumented test, since the cases are being covered in the unit tests, but if is necessary we can create Instrumented tests using espresso.

The classes that are being tested are:

* Repositories
* UseCases
* ViewModel

#### THEME

This project is prepared for Dark/Light mode. There is a default color scheme and it should be easy to change to Company color scheme.
