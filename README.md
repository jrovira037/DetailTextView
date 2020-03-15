# DetailTextView

[![](https://jitpack.io/v/jrovira037/DetailTextView.svg)](https://jitpack.io/#jrovira037/DetailTextView)
[![Known Vulnerabilities](https://snyk.io/test/github/jrovira037/DetailTextView/badge.svg?targetFile=detailtextview/build.gradle)](https://snyk.io/test/github/jrovira037/DetailTextView?targetFile=detailtextview/build.gradle)

The goal of this project is to provide a better looking TextView for views that need to display details (i.e. details about a contact).

# Download


1. Add the JitPack repository to your build file 

```groovy
allprojects {
	repositories {
		...
		maven { url 'https://jitpack.io' }
	}
}
```

2. Add the dependency

```groovy
dependencies {
    implementation 'com.github.jrovira037:DetailTextView:0.1'
}
```

# Usage

1. Replace your current TextView tags from your .xml with DetailTextView:

```xml
<TextView
  ...
/>
```

  

```xml
<com.jroviraa.android.detailtextview.DetailTextView
  ...
/>
```

2. Replace your `TextView` objects with `DetailTextView` objects:

```kotlin
private lateinit var text: TextView
```

```kotlin
private lateinit var text: DetailTextView
```

_For a complete example check the app module of this project_
  
  
 # Result
 
 You should get a TextView that looks like this:
 
 [![](https://i.imgur.com/HRSXrIz.png)


