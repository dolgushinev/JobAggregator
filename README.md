#	Реализация агрегатора вакансий.
##	1. Постановка задачи

Программа скачивает страницу из интернета. Ссылка для скачивания указывается в аргументе команды при запуске jar, также в аргументах указывается за какой период нужно найти вакансии - пусть это будет кол-во месяцев от 1 до 12. Если ссылка на сайт sql.ru, просто есть префикс этого сайта, ваше приложение продолжает работу (константой храните ссылку https://www.sql.ru/forum/job-offers, а от пользователя ожидайте что он введёт просто sql.ru), если ссылка не на этот сайт, вы останавливаете приложение, так как ваше приложение работает только с этим сайтом. Вакансии надо искать по ключевым словам, ключевое слово можно передавать также как ссылку, через аргумент команды. Все вакансии что есть на форуме с этим ключевым словом в подзаголовке и опубликованы в указанный промежуток вы сохраняете в файл.  

## 2. Каким образом работать с проектом? 
Для запуска проекта используйте JobAggregator.jar

Примеры использования приложения:
* Запуск по умолчанию (сайт sql.ru, период 1 месяц, пустой список фильтров): 
java -jar JobAggregator.jar
* Запуск с обязательным указанием сайта и количества месяцев, а также опционального указания фильтров для поиска:
java -jar JobAggregator.jar sql.ru 1 java sql

Примечание. Если указано несколько фильтров поиск осуществляется по принципу логического ИЛИ
 