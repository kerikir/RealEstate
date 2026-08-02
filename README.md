# 🏠 Real Estate – UI-прототип

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)
[![Platform](https://img.shields.io/badge/Platform-Android-lightgrey)]()
[![Version](https://img.shields.io/badge/Version-1.0-blue)]()

Визуальный прототип приложения для поиска недвижимости. Три экрана, современный дизайн на Jetpack Compose, нижняя панель навигации и наглядные карточки объектов. Демонстрирует структуру интерфейса без реальной логики поиска и фильтрации.

---

## 🛠 Технологический стек

![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![Jetpack Compose](https://img.shields.io/badge/Jetpack%20Compose-4285F4?style=for-the-badge&logo=jetpackcompose&logoColor=white)
![Material 3](https://img.shields.io/badge/Material%203-757575?style=for-the-badge&logo=materialdesign&logoColor=white)
![Navigation Compose](https://img.shields.io/badge/Navigation-3DDC84?style=for-the-badge&logo=android&logoColor=white)

---

## 🧱 Особенности реализации

- **UI полностью на Compose**, без XML. Экраны построены с использованием `Scaffold`, `LazyColumn`, `Row` и других composable-компонентов.
- **Навигация** реализована с помощью `NavHost` и нижней панели (`NavigationBar`). Переход между экранами «Главная» и «Настройки» работает полноценно.
- **Данные для списка недвижимости** – захардкоженный список объектов, каждый из которых содержит цену, площадь, количество комнат, ванных, наличие гаража и ссылку на локальный ресурс изображения.
- **Категории** – контент списка не фильтруется.
- **Строка поиска** – `TextField`, значение которого нигде не используется.
- **Кнопка фильтрации** – просто иконка, без обработчика.
- **Экран настроек** – статичная верстка с иконкой профиля, именем, почтой.
- **Начальный экран** отображается при запуске, по нажатию автоматически переходит на главный экран через `navController.navigate`.

---

## 🚀 Быстрый старт

1. Перейдите в раздел [**Releases**](https://github.com/kerikir/RealEstate/releases).
2. Скачайте APK-файл (`RealEstateUI_v1.0.apk`).
3. **Установка:**
   - Откройте файл на Android-устройстве.
   - Если нужно, разрешите установку из неизвестных источников.
   - Следуйте инструкциям на экране.
4. Запустите «Real Estate» – изучайте интерфейс.

---

