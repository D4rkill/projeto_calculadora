/**
 * <p><strong>Classe de teste da Calculadora</strong></p>
 *
 * <p>Esta classe contém o método para realizar testes da classe {@link Calculadora}. Ela realiza chamadas para o
 * método {@code calcular} utilizando diferentes operadores e exibindo os resultados no console.</p>
 *
 * <p>Além disso, a classe valida o tratamento de exceções da calculadora,
 * testando as seguintes situações:</p>
 * <ul>
 *     <li>Divisão por zero</li>
 *     <li>Uso de operador inválido</li>
 *     <li>Garante que nenhum cálculo quebre o código</li>
 * </ul>
 *
 * <p>Este arquivo tem como ideia principal:</p>
 * <ul>
 *     <li>Testar a classe Calculadora</li>
 *     <li>Validar entradas</li>
 * </ul>
 *
 * @author William Nascimento de Oliveira
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal da aplicação. Responsável por instanciar a classe
     * {@link Calculadora} e executar diferentes operações matemáticas.</p>
     *
     * <p>As seguintes operações são demonstradas:</p>
     * <ul>
     *     <li>Soma: {@code calcular(2, 3, "+")}</li>
     *     <li>Subtração: {@code calcular(10, 4, "-")}</li>
     *     <li>Multiplicação: {@code calcular(3, 5, "*")}</li>
     *     <li>Divisão: {@code calcular(8, 2, "/")}</li>
     * </ul>
     *
     * <p>Também são testados dois cenários de erro sendo devidamente tratados:</p>
     * <ul>
     *     <li>Divisão por zero, que gera uma exceção</li>
     *     <li>Operador inválido</li>
     * </ul>
     *
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
