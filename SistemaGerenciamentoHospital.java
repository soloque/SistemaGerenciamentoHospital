package sistemagerenciamentohospital;
import java.util.Locale;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SistemaGerenciamentoHospital {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;

        while (opcao != 0) {
            while (opcao != 0) {
    System.out.println("===== Sistema de Gerenciamento de Hospital =====");
    System.out.println("1. Cadastrar Paciente");
    System.out.println("2. Alterar Cadastro de Paciente");
    System.out.println("3. Mostrar Lista de Pacientes");
    System.out.println("0. Sair");
    System.out.println("================================================");

    System.out.print("Digite o número da opção desejada: ");
    opcao = scanner.nextInt();
    scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do paciente: ");
                    String nomePaciente = scanner.nextLine();
                    System.out.print("Digite o tipo sanguíneo do paciente: ");
                    String tipoSanguineo = scanner.nextLine();
                    System.out.print("Digite o tipo de convênio do paciente (basico, comum, premium): ");
                    String tipoConvenio = scanner.nextLine();
                    System.out.print("Digite as outras doenças do paciente (separadas por vírgula): ");
                    String outrasDoencasInput = scanner.nextLine();
                    List<String> outrasDoencas = new ArrayList<>();
                    String[] doencas = outrasDoencasInput.split(",");
                    for (String doenca : doencas) {
                        outrasDoencas.add(doenca.trim());
                    }
                    System.out.print("O paciente possui alergia a substâncias (true/false)? ");
                    boolean alergiaSubstancias = scanner.nextBoolean();
                    System.out.print("O paciente recebeu alta (true/false)? ");
                    boolean alta = scanner.nextBoolean();

                    Paciente paciente = new Paciente(nomePaciente, tipoSanguineo, tipoConvenio, outrasDoencas, alergiaSubstancias, alta);
                    hospital.cadastrarPaciente(paciente);
                    break;
                case 2:
                    System.out.print("Digite o nome do paciente a ser alterado: ");
                    String nomePacienteAlteracao = scanner.nextLine();
                    hospital.alterarCadastroPaciente(nomePacienteAlteracao);
                    break;
              case 3:
            // Mostrar lista de pacientes
System.out.println("Lista de Pacientes Cadastrados:");
for (Paciente p : hospital.getPacientes()) {
    System.out.println("Nome: " + p.getNome());
    System.out.println("Tipo Sanguíneo: " + p.getTipoSanguineo());
    System.out.println("Tipo de Convênio: " + p.getTipoConvenio());
    System.out.println("Outras Doenças: " + p.getOutrasDoencas());
    System.out.println("Alergia a Substâncias: " + (p.isAlergiaSubstancias() ? "Sim" : "Não"));
    System.out.println("Alta: " + (p.isAlta() ? "Sim" : "Não"));
    System.out.println("----------------------");
}

            break;
        case 0:
            System.out.println("Encerrando o programa...");
            break;
        default:
            System.out.println("Opção inválida!");
            break;
    }
}}}}