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
[x] 9. Operadores Lógicos
[x] 10. Operadores de Comparação

OPERADORES CONDICIONAIS
[x] 11. Operadores de Atribuição
[x] 12. Condicional If Else
[X] 13. Condicional When

LISTA DE DADOS
[X] 14. Array
[x] 15. ArrayList

DESAFIO DO DADO
[x] 16. Desafio do Dado

ESTRUTURA DE REPETIÇÃO
[x] 17. Estrutura de repetição while
[X] 18. Estrutura de repetição do while
[x] 19. Estrutura de repetição for
[x] 20. Estrutura de repetição forEach

FINAL
[x] 21. Funções
[	] 22. Valores padrões
[	] 23. Fim do módulo básico


```
package com.kotlinfromzero
import javax.swing.JOptionPane

fun main(args: Array<String>) {
    println("Input de dados via interface  import javax.swing.JOptionPane")
    val name = JOptionPane.showInputDialog("Digite seu nome")

    JOptionPane.showMessageDialog(null, "Olá $name")
}


```