$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/features/scenarioOutline.feature");
formatter.feature({
  "name": "Login Functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Check login Func with valid Cred.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the application with valid URL",
  "keyword": "Given "
});
formatter.step({
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.step({
  "name": "user should be redirect to Home page",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "admin123",
        "admin"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin"
      ]
    },
    {
      "cells": [
        "admin123",
        "admin123"
      ]
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Check login Func with valid Cred.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the application with valid URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginClass.launch_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin123\" and \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginClass.user_enters_valid_Credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginClass.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be redirect to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginClass.user_should_be_redirect_to_Home_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(),\u0027Dashboard\u0027)]\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-Q4NAHNC\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: C:\\Users\\123\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:61708}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: b9d7187490a491af36d5f9fa92006c46\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(),\u0027Dashboard\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.LoginClass.user_should_be_redirect_to_Home_page(LoginClass.java:36)\r\n\tat ✽.user should be redirect to Home page(src/main/java/features/scenarioOutline.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Check login Func with valid Cred.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the application with valid URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginClass.launch_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Admin\" and \"admin\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginClass.user_enters_valid_Credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginClass.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be redirect to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginClass.user_should_be_redirect_to_Home_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(),\u0027Dashboard\u0027)]\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-Q4NAHNC\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: C:\\Users\\123\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:60303}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 08cef3d78c220c253e1ff509af8411ba\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(),\u0027Dashboard\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.LoginClass.user_should_be_redirect_to_Home_page(LoginClass.java:36)\r\n\tat ✽.user should be redirect to Home page(src/main/java/features/scenarioOutline.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Check login Func with valid Cred.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the application with valid URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginClass.launch_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"admin123\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginClass.user_enters_valid_Credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginClass.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be redirect to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginClass.user_should_be_redirect_to_Home_page()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//h1[contains(text(),\u0027Dashboard\u0027)]\"}\n  (Session info: chrome\u003d93.0.4577.82)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-Q4NAHNC\u0027, ip: \u0027192.168.1.5\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_261\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 93.0.4577.82, chrome: {chromedriverVersion: 93.0.4577.63 (ff5c0da2ec0ad..., userDataDir: C:\\Users\\123\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:55997}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 075248c5f6879b5c296dbc9cbd14291c\n*** Element info: {Using\u003dxpath, value\u003d//h1[contains(text(),\u0027Dashboard\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepDefinition.LoginClass.user_should_be_redirect_to_Home_page(LoginClass.java:36)\r\n\tat ✽.user should be redirect to Home page(src/main/java/features/scenarioOutline.feature:7)\r\n",
  "status": "failed"
});
formatter.scenario({
  "name": "Check login Func with valid Cred.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Launch the application with valid URL",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginClass.launch_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters \"Admin\" and \"admin123\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginClass.user_enters_valid_Credentials(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Login button",
  "keyword": "And "
});
formatter.match({
  "location": "LoginClass.click_on_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be redirect to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginClass.user_should_be_redirect_to_Home_page()"
});
formatter.result({
  "status": "passed"
});
});