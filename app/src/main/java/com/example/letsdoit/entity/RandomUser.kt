package com.example.letsdoit.entity

data class RandomUser(
    val results:List<Results>
)
data class Results(
val gender:String,
val name:Name,
val location:Location,
val email:String,
val id:Id,
val picture:Picture
)
data class Name(
    val title:String,
    val first:String,
    val last:String
)
data class Location(

    val city:String
)
data class Id(
    val name:String,
    val value:String
)
data class Picture(
    val large:String,
    val medium:String,
    val thumbnail:String
)