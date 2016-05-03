# ImageLetterIcon
Material letter icon with circle background. Also supports for image for user contact.

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-ImageLetterIcon-green.svg?style=true)](https://android-arsenal.com/details/1/2762)

 [ ![Download](https://api.bintray.com/packages/akashandroid90/maven/image-letter-icon/images/download.svg) ](https://bintray.com/akashandroid90/maven/image-letter-icon/_latestVersion)
 
 <a href='https://bintray.com/akashandroid90/maven/image-letter-icon/view?source=watch' alt='Get automatic notifications about new "image-letter-icon" versions'><img src='https://www.bintray.com/docs/images/bintray_badge_color.png'></a>

![Square Initials](images/one.png)
![Square Initials](images/two.png)
![Alternate Initial Square Image](images/three.png)
![Alternate Initial Circular Image](images/four.png)
Gradle
-------------------------

```

dependencies {
    compile 'com.github.akashandroid90:imageletter:1.4'
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
<com.imageletter.MaterialLetterIcon
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


Developed By
--------------------
Akash Jain

License
-----------

```
Copyright 2015 Akash Jain

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
