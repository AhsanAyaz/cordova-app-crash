# cordova-app-crash

Crash your app on demand. Created for crash testing.
Crashlytics provide the API for native apps but as of now (15th Oct 2018), there's no such cordova plugin to support this.

## Installation

```bash
$ cordova plugin add cordova-app-crash
```

## Usage

```javascript
cordova.plugins.AppCrash.crash(
    "crash",
    (successResp) => {
        console.log(successResp);
    }, (error) => {
        console.log(error);
    }
);
```

## Collaborators
- [Ahsan Ayaz](https://github.com/ahsanayaz)
- [Habib Ali](https://github.com/HabibAli)

