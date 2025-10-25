# Estruturas de Dados - Listas Encadeadas em Java

## 📋 Descrição
Implementação completa de três tipos de listas encadeadas em Java, desenvolvido como trabalho acadêmico para a disciplina de Estrutura de Dados.

## 🎯 Estruturas Implementadas

### 1. Lista Encadeada Simples
- Cada nó aponta apenas para o próximo
- Inserção, remoção, busca e listagem
- Representação: [A] -> [B] -> [C] -> null

### 2. Lista Duplamente Encadeada
- Cada nó aponta para o próximo e anterior
- Navegação bidirecional
- Representação: null <- [A] <-> [B] <-> [C] -> null

### 3. Lista Encadeada Circular
- O último nó aponta de volta para o primeiro
- Estrutura circular contínua
- Representação: [A] -> [B] -> [C] -> [A]...

## 🚀 Como Executar

### Pré-requisitos
- JDK 8 ou superior instalado
- VS Code com Extension Pack for Java

### Executando no Terminal

```bash
# Navegar até o diretório do projeto
cd EstruturasDeDados

# Compilar Lista Simples
javac ListaSimples/*.java
java ListaSimples.TestListaSimples

# Compilar Lista Dupla
javac ListaDupla/*.java
java ListaDupla.TestListaDupla

# Compilar Lista Circular
javac ListaCircular/*.java
java ListaCircular.TestListaCircular

# Executar GUI
javac GUI/*.java
java GUI.ListaGUI
```

### Executando no VS Code
1. Abra o projeto no VS Code
2. Navegue até o arquivo de teste desejado
3. Clique em "Run" acima do método main()

## 💻 Interface Gráfica

O projeto inclui uma GUI desenvolvida em Swing que permite:
- ✅ Visualização das três estruturas
- ✅ Inserção no início e fim
- ✅ Remoção de elementos
- ✅ Busca de valores
- ✅ Visualização gráfica da estrutura

## 📦 Estrutura do Projeto

```
EstruturasDeDados/
├── ListaSimples/
│   ├── Node.java
│   ├── ListaEncadeadaSimples.java
│   └── TestListaSimples.java
├── ListaDupla/
│   ├── NodeDuplo.java
│   ├── ListaDuplamenteEncadeada.java
│   └── TestListaDupla.java
├── ListaCircular/
│   ├── NodeCircular.java
│   ├── ListaEncadeadaCircular.java
│   └── TestListaCircular.java
├── GUI/
│   ├── ListaGUI.java
│   └── MainGUI.java
└── README.md
```

## 📸 Screenshots

![GUI Principal](screenshot_gui.png)

## 👨‍💻 Autor
[João Pedro Balduino Leitão]

## 📅 Data de Entrega
24 de outubro de 2025

## 🎓 Instituição
Centro Universitário Santo Agostinho - UNIFSA
Engenharia de Software