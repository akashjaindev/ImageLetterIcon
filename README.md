# ImageLetterIcon
Material letter icon with circle background. Also supports for image for user contact.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ImageLetterIcon-green.svg?style=true)](https://android-arsenal.com/details/1/2762)

 [ ![Download](https://api.bintray.com/packages/akashandroid90/maven/image-letter-icon/images/download.svg) ](https://bintray.com/akashandroid90/maven/image-letter-icon/_latestVersion)
 
 <a href='https://bintray.com/akashandroid90/maven/image-letter-icon/view?source=watch' alt='Get automatic notifications about new "image-letter-icon" versions'><img src='https://www.bintray.com/docs/images/bintray_badge_color.png'></a>

<a href="https://play.google.com/store/apps/details?id=com.imagelettericon" alt="Download from Google Play">
  <img src="http://www.android.com/images/brand/android_app_on_play_large.png">
</a>


![Square Initials](images/one.png)
![Square Initials](images/two.png)
![Alternate Initial Square Image](images/three.png)
![Alternate Initial Circular Image](images/four.png)
Gradle
-------------------------

```

dependencies {
    compile 'com.github.akashandroid90:imageletter:1.8@aar'
}

```

ChangeLog
-----

bug fixes

vector drawable support 

Usage
-----

Declare in XML (see xml attributes below for customization):

```xml
<com.github.akashandroid90.imageletter.MaterialLetterIcon
    android:layout_width="@dimen/letter_icon_size"
    android:layout_height="@dimen/letter_icon_size" />
```

Or static initializer (see xml attributes below for customization):

```java
MaterialLetterIcon icon = new MaterialLetterIcon.Builder(context) //
            .shapeColor(getResources().getColor(R.color.circle_color))
            .setShapeType(MaterialLetterIcon.SHAPE_CIRCLE)
            .letter("S")
            .letterColor(getResources().getColor(R.color.letter_color))
            .letterSize(26)
            .lettersNumber(1)
            .letterTypeface(yourTypeface)
            .initials(false)
            .initialsNumber(2)
            .create();
```


Configure using xml attributes or setters in code:

```java
app:shape_color="@color/black"      // shape color
app:shape_type="circle"             // shape type
app:letter=""                       // letter or string to get first letter from
app:letter_color="@color/white"     // letter color
app:letter_size="26"                // letter size SP
app:letters_number="1"              // number of letters to get from string
app:initials="false"                // turn on initials mode
app:initials_number="2"             // number of initials to be showed
app:corner_radius="1dp"             // radius of image to make at corner
app:is_oval="true"                  // to make a circular image
app:border_width="1dp"              // border width around the image
app:border_color="@color/black"     //border color around image
```

Donations
---------

This project needs you! If you would like to support this project's further development, the creator of this project or the continuous maintenance of this project, feel free to donate. Your donation is highly appreciated (and I love food, coffee and beer). Thank you!

**PayPal**

* **[Donate $5]**: Thank's for creating this project, here's a coffee (or some beer) for you!
* **[Donate $10]**: Wow, I am stunned. Let me take you to the movies!
* **[Donate $15]**: I really appreciate your work, let's grab some lunch!
* **[Donate $25]**: That's some awesome stuff you did right there, dinner is on me!
* **[Donate $50]**: I really really want to support this project, great job!
* **[Donate $100]**: You are the man! This project saved me hours (if not days) of struggle and hard work, simply awesome!
* **[Donate $2799]**: Go buddy, buy Macbook Pro for yourself!
Of course, you can also choose what you want to donate, all donations are awesome!

Developed By
--------------------
Akash Jain


[Donate $5]: 		https://www.paypal.me/akashandroid/5
[Donate $10]:  		https://www.paypal.me/akashandroid/10
[Donate $15]:  		https://www.paypal.me/akashandroid/15
[Donate $25]:  		https://www.paypal.me/akashandroid/25
[Donate $50]: 		https://www.paypal.me/akashandroid/50
[Donate $100]: 		https://www.paypal.me/akashandroid/100
[Donate $2799]: 	https://www.paypal.me/akashandroid/2799
