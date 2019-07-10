# AudiencegeneIntegration

## Steps to intigrate our API

1) Register your account with valid Email address from https://audiencegene.com/

2) Login with authentication details.

3) Once admin activate your account you can access API_KEY.
(Note :- Usually it will take 24 hours to aprove your account)

4) Once account activated you can find API_KEY in settings tab.

5) Installation : Android Studio (or Gradle) No need to clone the repository or download any files -- just add this line to your app's build.gradle inside the dependencies section:

```
 compile 'com.gene:audiencegene:1.0.0'
                    (or)
 implementation 'com.gene:audiencegene:1.0.0' if you are using Android Studio version 3.0
```

Note: We recommend you to use

```
 compile 'com.gene:audiencegene:1.+'
```

Usage : To initiate our library, place the below code at initial activity of your application(ex: splash activity).

GeneApp.initialize(MainActivity.this, "YOUR_API_KEY", "USER_GOOGLE_ADVERTISER_ID");

    GeneApp.start("transaction_name");
    
    GeneApp.age("26", "number");
    
    GeneApp.gender("male", "String");
    
    GeneApp.locationCity("hyderabad", "String");
    
    GeneApp.locationState("telengana", "String");
    
    GeneApp.locationCountry("India", "String");
    
    GeneApp.zipcode("500090", "number");
    
    GeneApp.add("from", "hyderabad", "string");
    
    GeneApp.add("to", "vijayawada", "string");
    
    GeneApp.add("b_date", "30-05-2019", "date");
    
    GeneApp.add("b_time", "123123123", "number");
    
    GeneApp.send();
```
context -> your application context
YOUR_API_KEY -> your registered application API key from https://audiencegene.com/
USER_GOOGLE_ADVERTISER_ID -> it is the google advertiserId from the mobile.
transaction_name -> name of thetransaction.
```
implement GeneCallbacks in the same Activity where you are calling above initialize() method, so that Callback methods will be overriden and you can redirect the user accourdingly with success, failure functions accordingly.

MainActivity extends AppCompatActivity implements GeneCallbacks
```
@Override public void onDataSuccess(String message, String data) { 
  //TODO for successful request with data as response

}

@Override
 public void onDataFailure(String message) {
    //TODO for failure with failure message.

}
```
