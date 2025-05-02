# 📊 Meganium Sales Data Unificado

> 🛒 Dados unificados de vendas dos produtos da marca **Meganium** em diferentes plataformas online (Shopee, Etsy, AliExpress, etc.)

Este repositório contém dados históricos de vendas dos produtos da linha **Meganium**, incluindo informações sobre quantidade, preço unitário, descontos, data de venda, localização do cliente, entre outros. O objetivo é permitir análises de mercado, comportamento do consumidor e otimização de campanhas de marketing.

---

## 📁 Estrutura do Arquivo

O arquivo principal é:

- `Meganium_Sales_Data_Unificado.csv` – Contém todas as vendas registradas até o momento.

### Colunas do CSV:

| Coluna              | Descrição                                                                 |
|---------------------|---------------------------------------------------------------------------|
| `product_sold`      | Nome do produto vendido                                                   |
| `date`              | Data da venda                                                             |
| `quantity`          | Quantidade vendida                                                        |
| `unit_price`        | Preço unitário do produto                                                 |
| `total_price`       | Preço total da venda (`unit_price * quantity`)                            |
| `currency`          | Moeda utilizada                                                           |
| `site`              | Plataforma onde ocorreu a venda (Etsy, Shopee, AliExpress)                |
| `discount_coupon`   | Código do cupom usado (se aplicável)                                      |
| `discount_value`    | Valor do desconto aplicado                                                  |
| `buyer_birth_date`  | Data de nascimento do comprador                                           |
| `buyer_name`        | Nome do comprador                                                         |
| `delivery_country`  | País de entrega do produto                                                |
| `invoice_id`        | ID único da fatura/venda                                                  |

---

## 🔍 Insights Extraídos

A partir dos dados fornecidos, foram extraídos diversos insights valiosos para análise de vendas:

### 📈 Produtos Mais Vendidos
- **NEW MEGANIUM RG35XX** foi o produto mais vendido em quantidade.
- **NEW MEGANIUM RG 40XXV** liderou em valor total vendido.

### 🌍 Países com Mais Compras
- **Canadá** lidera tanto em quantidade quanto em valor total de compras.
- **Austrália** e **Reino Unido** também mostram alta participação nas vendas.

### 💸 Uso de Cupons de Desconto
- **NEW MEGANIUM RG 40XXV** teve o maior número de cupons usados.
- Isso indica que ele pode ser alvo frequente de promoções ou ter grande demanda elástica ao preço.

### 📅 Faturamento Mensal
- Houve picos de vendas em **agosto e setembro**, indicando sazonalidade positiva.

### 🕰 Faixa Etária dos Clientes
- A maioria dos clientes está na faixa de **25 a 44 anos**, sugerindo público adulto jovem como foco principal.

### 🧮 Vendas por Site
- **Shopee** é a plataforma com maior volume de vendas em quantidade e valor.
- **AliExpress** também tem uma base sólida de clientes.

---

## 📁 Arquivos Gerados (Relatórios)

Os seguintes relatórios foram gerados com base nos dados:

| Relatório                                 | Conteúdo                                                    |
|------------------------------------------|-------------------------------------------------------------|
| `Produtos_Mais_Vendidos.xlsx`            | Ranking dos produtos com maior quantidade vendida           |
| `Produtos_Por_Valor_Total.xlsx`          | Produtos com maior valor total vendido                      |
| `Vendas_por_Site.xlsx`                   | Vendas por site em quantidade e valor                       |
| `Faturamento_Mensal.xlsx`                | Faturamento mensal                                          |
| `Vendas_por_Pais.xlsx`                   | Países com mais vendas                                      |
| `Cupons_usados_por_produto.xlsx`         | Produtos com mais uso de cupons                             |
| `Faixa_Etaria_Clientes.xlsx`             | Distribuição etária dos clientes                            |
| `top_5_produtos_por_site.csv`            | Top 5 produtos mais vendidos por site                       |
