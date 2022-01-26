João Vitor Conceição de Paula

Questões

A – Com suas palavras explique o que é lavagem de dinheiro.
  R: Lavagem de dinheiro é uma pratica utlizada para encobrir a origem de dinheiro ilegal, ou seja, quando alguém consegue dinheiro por meio de atividades ilícitas, ela não pode utilizar por conta da Receita Federal e a lavagem de dinheiro “limpa” o dinheiro, criando uma origem falsa e assim podendo utiliza-lo.

B – O que é Cartão de Pagamento do Governo Federal (CPGF), e qual a sua finalidade.
  R: É um meio de pagamento utilizado pelo governo que funciona de forma similar ao cartão de débito que utilizamos em nossas vidas, porém dentro de limites e regras específicas. O governo utiliza o CPGF para pagamentos de despesas próprias, que possam ser enquadradas como suprimento de fundos.

C – Quem pode utilizar o CPGF?
  R: Prefeito ou Servidor da Prefeitura.

D – Qual a URL onde é possível fazer o download dos arquivos do CPGF?
  R: https://www.portaltransparencia.gov.br/download-de-dados/cpgf

E – Qual a URL da paǵina com a descrição dos campos (ou dicionário de dados) da CPGF?
  R: https://www.portaldatransparencia.gov.br/pagina-interna/603393-dicionario-de-dados-cpgf

F – É possível identificar o nome e o documento do portador do CPGF, em todas as
movimentações ou há movimentações onde não é possível identificar o portador?
  R: Sim, na maioria das movimentações é possível identificar o nome do portador, mas às vezes o nome fica sigiloso e as informações protegidas por sigilo.

G – É possível identificar o Órgão do portador do CPGF?
R: Sim, em todas as movimentações há o nome do Órgão portador.

H - Qual o nome do Órgão cujo código é 20402?
  R: Agência Espacial Brasileira

I - É possível identificar o Nome e Documento (CNPJ) dos favorecidos pela utilização do
CPGF?
  R: Sim, é possível, a menos que as informações estejam protegidas por sigilo.

J – É possível identificar a data e o valor das movimentações financeiras do CPGF, em todas as movimentações? Ou há movimentações onde não é possível identificar as datas e ou valores?
  R: Sim, em todas as movimentações do CPGF é possível identificar a data com o ano/mês e também o valor da transação.

K (código) – Qual a soma total das movimentações utilizando o CPGF?
  R: 5619007.95

L (código) – Qual a soma das movimentações sigilosas ?
  R: 3108731.15

M (código) – Qual o Órgão que mais realizou movimentações sigilosas no período e qual o valor (somado)?

N (código) – Qual o nome do portador que mais realizou saques no período? Qual a soma
dos saques realizados por ele? Qual o nome do Órgão desse portador?

O (código) – Qual o nome do favorecido que mais recebeu compras realizadas utilizando o CPGF?

P - Descreva qual a abordagem utilizada para desenvolver o código para os ítens de K a O.
  R: Na resposta K, precisei transformar a “String” em “Double” para conseguir fazer a soma do valor das transações.
Na resposta L, precisei tratar a “String nomePortador” tirando as aspas e utilizando o método equals do pacote Java Lang. Dessa forma consegui filtrar a palavra “Sigiloso” e somar o valor da transação desse campo.
