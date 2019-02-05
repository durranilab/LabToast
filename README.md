# Lab Custom Toast

[ ![Download](https://api.bintray.com/packages/durranilab/maven/com.durranilab.labtoast/images/download.svg) ](https://bintray.com/durranilab/maven/com.durranilab.labtoast/_latestVersion)

![](https://raw.githubusercontent.com/durranilab/LabToast/master/preview_img.gif)

##### Lab Custom Toast is a beautiful awesome custom toast alerts for Android.

### New Features!

  - Beautiful Toast
  - Rounded,Medium, Square Corners
  - Custom Icon Support
  - Custom Background Supoprt (Both Colors and Images)
  - Custom Position Support
  - 

### How to Use
In your build.gradle (Module)
```sh
implementation 'com.durranilab.labtoast:1.0'
```

In your activity

```
import com.durranilab.labtoast.LabToast;
```

```
LabToast labToast;
labToast = new LabToast(MainActivity.this);
labToast.showToast("Hey! This is Lab Custom Toast",Toast.LENGTH_LONG);
```

```
// Custom Corners - 1,2,3
labToast.setCornerStyle(2);
```

```
// Custom Icon 
labToast.setIcon(R.mipmap.ic_launcher);
```

```
// Custom Background Color 
labToast.setBackgroundColor(Color.parseColor("#000000"));
```

```
// Custom Text Color 
labToast.setTextColor(Color.parseColor("#00FF00"));
```

```
// Custom Background Drawable 
 labToast.setBackgroundDrawable(R.drawable.bg_img_btn);
```

```
// Custom Postion (TOP,CENTER,BOTTOM)
  labToast.setPositon(CENTER);
```

Support
----
for more please email at contact@durranilab.com
