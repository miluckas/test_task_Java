# Тестовое задание:
Система на бэкенде использует REST API и обрабатывает запросы с сайта/приложения, на котором
продаются товары компании.
В рамках задания мы добавляем новый метод расчёта стоимости корзины пользователя. Необходимо предусмотреть следующую логику работы метода:
Эндпойнт получает на вход объект "Корзина"
1. Массив товаров
- id товара (int)
- количество товаров (int).
2. Доп. данные
- тип оплаты
- id адреса из адресной книги пользователя (если есть)
На выходе объект "Расчитанная корзина"
1. массив товаров
- id товара (int)
- количество товаров (int)
- сумма по позиции (float)
2. общая сумма (float)
2. Метод API для расчёта цен использует внешний микросервис (по http)
3. Система хранит информацию о ценах товаров в кэше, если нет информации в кэше, то берёт информацию из внешнего микросервиса и кладёт их в кэш
