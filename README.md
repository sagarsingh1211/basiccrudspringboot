# basiccrudspringboot
Basic crud operation, storing details to a list
this request will resturn all the users stored in the list.
GET            :    http://localhost:8080/home/users (get all users list)

This is post type to store user to list type will be <b>application/json</b>
POST           :    http://localhost:8080/home/addUser (add user {"id":1,"name":"test3","city":"bang3"})

Put will check the list if same id available for any object so the other feilds will be updated else it will add new user to list.
PUT            :    http://localhost:8080/home/update (("id":1,"name":"test3u","city":"bang3u"})

Base on id user will be deleted from users list.
DELETE         :    http://localhost:8080/home/delete/1 
