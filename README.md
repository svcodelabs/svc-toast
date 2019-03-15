# svc-toast

add following code in project level gradle file

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
add following dependency in app level gradle file

	dependencies {
	        implementation 'com.github.svcodelabs:svc-toast:1.09'
	}

Usage:

private lateinit var toast: SVCToast

toast = SVCToast(this, this)

toast.errorToast()
or
toast.successToastCustom("Message", ToastLength.LONG)
