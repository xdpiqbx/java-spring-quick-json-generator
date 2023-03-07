## Quick JSON Generator

---

### If you need free Quick JSON Generator =)

---

#### Just choose the fields you need and click on the button

![001.jpg](images%2F001.jpg)
![002.jpg](images%2F002.jpg)

---

#### Maybe you need 1000 random emails? Or something else?

![003.jpg](images%2F003.jpg)
![004.jpg](images%2F004.jpg)

#### For today developed just short entity - Person

---

>Person fields:
1. `id`: Long (iterate from 0 to last item, always different)
2. `uuid`: String (always different)
3. `firstName`: String (there are 100 in array, 50 male / 50 female)
4. `lastName`: String (there are 100 in array)
5. `email`: 3 methods (mail basics on firstName or lastName or firstName.lastName)
6. `phone`: in format +1 (444) 333 5555 (random digits)
7. `country`: array (there are 197 in array)
8. `state`: array (there are 87 in array)
9. `city`: array (there are 162 in array)
10. `address`: Street, City, State, ZIP code. (there are 124 streets in array)
11. `postalZipCode`: Integer 9 random digits

---

- Java
- Spring MVC
- Thymeleaf
- JSON

---

Default PORT: `8088`
You can change PORT in [`src/main/resources/application.yml`](src/main/resources/application.yml)

---

To start App on Windows you can use `WinRunApp.bat` (already in project root folder)
```batch
if not exist ".\target\QuickJsonGenerator.jar" (
    mvn clean install && java -jar .\target\QuickJsonGenerator.jar
) else (
    java -jar .\target\QuickJsonGenerator.jar
)
```

---

To start App on Unix you can use `UnixRunApp.sh` (already in project root folder)
```bash
if [ ! -f "./target/QuickJsonGenerator.jar" ]; then
    mvn clean install && java -jar ./target/QuickJsonGenerator.jar
else
    java -jar ./target/QuickJsonGenerator.jar
fi
```

---

P.S. Maybe i will extend it soon...