# 💰 Cofrinho de Moedas

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-green.svg)

Aplicação simples em **Java** que simula um cofrinho virtual. Você pode adicionar, remover e listar moedas (Real, Dólar, Euro) e calcular o total convertido para **Real (BRL)**.

> \*\*Observação\*\*: As cotações de conversão para Real usadas no projeto são **fictícias** (USD=5.50; EUR=6.00) e servem apenas para fins didáticos.

---

## 🚀 Funcionalidades

- Adicionar moeda: Real, Dólar ou Euro.
- Remover moeda pelo índice.
- Listar moedas com seus índices e valores.
- Calcular o total em Real somando todas as moedas convertidas.

---

## 🛠️ Tecnologias e conceitos

- **Java SE**
- `ArrayList` para armazenamento das moedas.
- **POO**: abstração, herança e polimorfismo.
  - Classe abstrata `Moeda` e subclasses `Real`, `Dolar`, `Euro`.

---

## 📂 Estrutura do projeto

```
src/
└── trabalho/
    ├── Principal.java    # Menu interativo de console
    ├── Cofrinho.java     # Armazena e gerencia moedas
    ├── Moeda.java        # Classe abstrata base
    ├── Real.java         # Implementação para Real (BRL)
    ├── Dolar.java        # Implementação para Dólar (USD)
    └── Euro.java         # Implementação para Euro (EUR)
```

---

## ▶️ Como executar

1. **Clone o repositório** (substitua pelo seu usuário/URL):
   ```bash
   git clone https://github.com/seu-usuario/cofrinho-moedas.git
   cd cofrinho-moedas
   ```
2. **Compile os arquivos** (assumindo que o diretório `src` está na raiz):
   ```bash
   javac -d out src/trabalho/*.java
   ```
3. **Execute o programa**:
   ```bash
   java -cp out trabalho.Principal
   ```

> Dica: Se não utiliza `src/` e os `.java` estão na raiz, ajuste os caminhos para `javac trabalho/*.java` e `java trabalho.Principal`.

---

## 💡 Exemplo de uso

```
--- MENU ---
1 - Adicionar moeda
2 - Remover moeda
3 - Listar moedas
4 - Calcular total em Real
0 - Sair
Escolha: 1
Escolha a moeda: 1-Real | 2-Dólar | 3-Euro
Valor: 10
Moeda adicionada!
```

---

## 🔍 Observações importantes

- As cotações são **fictícias**:
  - Dólar → Real: 1 USD = 5.50 BRL
  - Euro → Real: 1 EUR = 6.00 BRL
- Caso copie e cole código da web, verifique se os caracteres especiais (como `<` e `>`) não foram convertidos para entidades HTML (`&lt;`, `&gt;`, `&amp;`). No Java, devem ser usados os símbolos originais.

---

## 📜 Licença

Este projeto está sob a licença **MIT**. Consulte o arquivo `LICENSE` ou
[clique aqui](https://opensource.org/licenses/MIT).

---

## 👤 Autor

IDENILTON FERREIRA SILVA
