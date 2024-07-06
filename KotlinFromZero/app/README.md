Curso Udemy - Aprenda o básico da linguagem Kotlin
https://www.udemy.com/course/kotlin-aprenda-do-zero-modulo-basico/

Conteúdo do curso
INTRODUÇÃO
[x] 1. Introdução
[x] 2. Fundamentos
[x] 3. Variáveis e Sintaxe
[x] 4. Tipos Pirmitivos
[x] 5. Conversão de Tipos Pirmitivos
[X] 6. Kotlin - Aula 007 - Variáveis

LEITURA DE DADOS
[x] 7. Entrada de dados com ReadLine
[NO] 8. Entrada de dados com JOptionPane

OPERADORES LOGIGOS
[x] 9. Kotlin - Aula 008 - Operadores Lógicos
[x] 10. Kotlin - Aula 010 - Operadores de Comparação

OPERADORES CONDICIONAIS
[x] 11. Kotlin - Aula 009 - Operadores de Atribuição
[	] 12. Kotlin - Aula 011 - Condicional If Else
[	] 13. Kotlin - Aula 012 - Condicional When

LISTA DE DADOS
[	] 14. Kotlin - Aula 014 - Array
[	] 15. Kotlin - Aula 015 - ArrayList

DESAFIO DO DADO
16. Kotlin - Aula 013 - Desafio do Dado

ESTRUTURA DE REPETIÇÃO
[	] 17. Kotlin - Aula 016 - Estrutura de repetição while
[	] 18. Kotlin - Aula 017 - Estrutura de repetição do while
[	] 19. Kotlin - Aula 018 - Estrutura de repetição for
[	] 20. Kotlin - Aula 019 - Estrutura de repetição forEach

FINAL
[	] 21. Kotlin - Aula 020 - Funções
[	] 22. Kotlin - Aula 021 - Valores padrões
[	] 23. Kotlin - Aula 022 - Fim do módulo básico


```
package com.kotlinfromzero
import javax.swing.JOptionPane

fun main(args: Array<String>) {
    println("Input de dados via interface  import javax.swing.JOptionPane")
    val name = JOptionPane.showInputDialog("Digite seu nome")

    JOptionPane.showMessageDialog(null, "Olá $name")
}


```