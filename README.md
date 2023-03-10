Мы будет разрабатывать этот проект в блоке микросервис.

Опишем желания заказчика.

- имеет каталог блюд

- может принимать заказы клиента на сайте. Либо через скачанное клиентами приложение

- предоставляет клиенту курьерскую доставку. Клиент может контролировать положение курьера

- предоставляет курьерам приложения, где они могут отчитываться о заказах, обновлять свое положение

- имеет админку в виде веб приложения, где можно оформлять поставки продуктов, а также видеть прибыль.

Приложение будет состоять из maven моделей. Каждый модуль будет отдельное Spring boot приложение.

Опишем структуру проекта job4j_fast_food.

/admin/ - админка
/dish/ - сервис блюд
/order/ - сервис заказов
/delivery/ - сервис доставки
/kitchen/ - сервис кухни
/payment/ - сервис платежей
/notification/ - сервис уведомлений
/domain/ - доменные модели

1. Техническое задание - проект доставка еды "Быстро и в точку" 
2. Монолитные системы (Добавление класса, описывающего модель Dish, создание интерфейса содержащего методы работы с моделью Dish)
исправления
3. Микросервисные системы ( зависимости Spring boot, Spring Data, Liquibase)
4. Этапы проектирования
Удаление дублирующихся зависимостей.
Корневой pom.xml содержит общие зависимости, а в модулях они наследуются от корневого, то есть не надо дублировать то что уже есть в корневом pom.-