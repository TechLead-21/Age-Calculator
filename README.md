![30 Days of Kotlin](https://res.cloudinary.com/techlead/image/upload/v1589728747/Github/h8c4ahbfbyorve8su96x.png "😃")

---


# **Age Calculator app** 📲

> In this mini application, user will have to enter the **birth year** in the input text field ( ex. 1998 ).
> After that, click on the **Get Age** button.
> Then it will show the **age** in years in a text view.

<br>

## Concepts Used

1. **User defined Function**
   
    > You can create functions yourself. Such functions are called user-defined functions.

    ```kotlin
    public fun calculateAge(view: View){
        // rest of the code
    }
    ```

<br>

2. **Kotlin Methods**

    >  The getInstance() method in Calendar class is used to get a calendar using the current time zone and locale of the system

    ```kotlin
    val currentYear= Calendar.getInstance().get(Calendar.YEAR)
    ```

    > Returns a string representation of the object. Can be called with a null receiver, in which case it returns the string "null".

    ```kotlin
    val dob:String = etBirth.text.toString()
    ```

    > Parses the string as an **Int** number and returns the result.

    ```kotlin
    val age = currentYear - dob.toInt()
    ```

## 3. **Kotlin If else**

> In Kotlin, if else operators behave the same way as it does in Java. If executes a certain section of code if the condition is true. It can have an optional else clause.

```kotlin
if (){
         // code
    }
else{
        // code
    }
```


## 4. **Kotlin Ranges and Progression**

> Kotlin lets you easily create ranges of values using the rangeTo() function from the kotlin.ranges package and its operator form ```...``` Usually, ```rangeTo()``` is complemented by in or ```!in``` functions.

```kotlin
if (age in 18..28){
    //code
}

else{
    //code
}
```

<br>
