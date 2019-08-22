# basiccrudspringboot
Basic crud operation, storing details to a list
#### 1 : This request will return all the users stored in the list.

(get all users list)

### GET            :    http://localhost:8080/home/users 

#### 2 : This is post type to store user to list type will be <b>application/json</b>

 (add user {"id":1,"name":"test3","city":"bang3"})
 
### POST           :    http://localhost:8080/home/addUser

#### 3 : Put will check the list if same id available for any object so the other fields will be updated else it will add new user to list.

(("id":1,"name":"test3u","city":"bang3u"})

### PUT            :    http://localhost:8080/home/update 

#### 4 : Base on id user will be deleted from users list. below user will be deleted whose is is 1.

### DELETE         :    http://localhost:8080/home/delete/1 
