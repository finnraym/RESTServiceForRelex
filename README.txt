Примеры тестовых данных, REST-запросов и ответов.

/get_max_value - Получение максимального значения из последовательности чисел в файле
/get_min_value - Получение минимального значения из последовательности чисел в файле
/get_median - Получение медианы из последовательности чисел в файле
/get_average - Получение среднего арифметического значения из последовательности чисел в файле
/get_increase_seq - Получение самых длинных возрастающих последовательностей из чисел в файле
/get_decrease_seq - Получение самых длинных убывающих последовательностей из чисел в файле

Пример данных (лежат в файле test.txt):
4
63
12
8
6
5
51
2
123
74
82
56
21
3
19
25
94
80
55
23

Примеры запросов и ответов:

=========================================

REQUEST:

localhost:8080/get_max_value

BODY:

{
    "filePath" : "test.txt"
}

RESPONSE:

{
    "max_value": 123
}

=========================================

REQUEST:

localhost:8080/get_min_value

BODY:

{
    "filePath" : "test.txt"
}

RESPONSE:

{
    "min_value": 2
}

=========================================

REQUEST:

localhost:8080/get_median

BODY:

{
    "filePath" : "test.txt"
}

RESPONSE:

{
    "median": 24.0
}

=========================================

REQUEST:

localhost:8080/get_average

BODY:

{
    "filePath" : "test.txt"
}

RESPONSE:

{
    "average": 40.3
}

=========================================

REQUEST:

localhost:8080//get_increase_seq

BODY:

{
    "filePath" : "test.txt"
}

RESPONSE:

{
    "increase_sequence_1": [
        3,
        19,
        25,
        94
    ]
}

=========================================

REQUEST:

localhost:8080/get_decrease_seq

BODY:

{
    "filePath" : "test.txt"
}

RESPONSE:

{
    "decrease_sequence_1": [
        63,
        12,
        8,
        6,
        5
    ]
}

=========================================


