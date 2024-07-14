# android_beginner_course
Udemy - Desenvolvedor Android Iniciante (https://www.udemy.com/share/106kiM3@5Ikt7dJtI2TsF0WUbFUGmx74oKsvwenn1fCjcosVHRArZtBvSePaxpVAB89iRABC/)

Android Beginner

Seção 1: Introdução

Seção 2: Introdução à computação

Seção 3: Introdução à lógica e algoritmos

Seção 4: Instalação Java e IntelliJ - Windows, Linux e Mac

Seção 5: Java - Conceitos e fundamentos

Seção 6: Java básico - Variáveis, operações e funções

Seção 7: Android - Conceitos e fundamentos

Seção 8: Instalação Android Studio - Windows, Linux e Mac

Seção 9: Configuracao emulador - Windows, Linux e Mac

Seção 10: Layout - Conceitos iniciais
- [x] 52. Conceitos e definições de Layout
- [x] 53. LinearLayout
- [x] 54. Atributos comuns de layout

Seção 11: Aplicativo 1 - Conversão de moedas
- [x] 55. O que vou aprender nesta seção?
- [x] 56. Criação do projeto
- [x] 57. Estrutura de um projeto Android
- [x] 58. Convenções de código
- [x] 59. Criação dos elementos de Interface
- [x] 60. Identificando Elementos
- [x] 61. Padrão ViewHolder
- [x] 62. Adicionando evento de click
- [x] 63. Validação de dados
- [x] 64. Implementando lógica da aplicação
- [x] 65. Layout - Botão e cores
- [x] 66. Layout - Textos

Seção 12: Aplicativo 2 - Festa de final de ano
- [x] 67. O que vou aprender nesta seção?
- [x] 68. Criação do projeto
- [x] 69. Alteração de ícone
- [x] 70. Elementos de interface - MainActivity
- [x] 71. Criação de Activity - DetailsActivity
- [x] 72. Elementos de Interface - DetailsActivity
- [x] 73. Navegando entre activities
- [x] 74. SharedPreferences
- [x] 75. Lógica - Dia atual e dias restantes
- [x] 76. Salvando confirmação de presença
- [x] 77. Obtendo confirmação na MainActivity
- [x] 78. Ciclo de vida de Activity
- [x] 79. OnResume - MainActivity
- [x] 80. Passando dados entre Activities
- [x] 81. Finalizando o Layout

Seção 13: Desafio - Festa de Fim de Ano
- [x] 82. Proposta & Instruções

Seção 14: Encerramento
- [x]83. Aula bônus - Cupons

====================================================================================================

Observações:
Aula 54: Atributos comuns de layout
- Margin é fora do elemento, padding é dentro do elemento

Aula 59
- "match_parent"= ocupa o tamanho do componente pai
- "wrap_content"= ocupa o tamanho do conteúdo do elemento
```
android:layout_width="match_parent"
android:layout_height="match_parent"/>
```

Aula 71
- Se quiser mudar a activity que vai iniciar, basta ir no arquivo manifest e colocar essas linhas dentro do corpo da activity
```
 <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
```

Ficaria assim se colocar a DetailsActivity para iniciar
```
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">

    <application
        android:allowBackup="true"
        android:dataExtractionRules="@xml/data_extraction_rules"
        android:fullBackupContent="@xml/backup_rules"
        android:icon="@mipmap/ic_launcher"
        android:label="@string/app_name"
        android:roundIcon="@mipmap/ic_launcher_round"
        android:supportsRtl="true"
        android:theme="@style/Theme.FestaFimDeAno"
        tools:targetApi="31">
        <activity
            android:name=".DetailsActivity"
            android:exported="false" 
              <intent-filter>
                <action android:name="android.intent.action.MAIN" />

                <category android:name="android.intent.category.LAUNCHER" />
            </intent-filter>
        </activity>
        <activity
            android:name=".MainActivity"
            android:exported="true" />        
    </application>

</manifest>
```