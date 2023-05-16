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
            // nao funciona
              case 4:
                System.out.println("=== Cadastro de Médico ===");
                System.out.print("Digite o nome do médico: ");
                String nomeMedico = scanner.nextLine();
                System.out.print("Digite a especialidade do médico: ");
                String especialidadeMedico = scanner.nextLine();

                Medico medico = new Medico(nomeMedico, especialidadeMedico);
                hospital.cadastrarMedico(medico);
                System.out.println("Médico cadastrado com sucesso!");
                break;

            case 5:
                System.out.println("=== Agendar Consulta ===");
                System.out.print("Digite o nome do paciente: ");
                String nomePacienteConsulta = scanner.nextLine();
                System.out.print("Nome do médico: ");
                String nomeMedicoConsulta = scanner.nextLine();
                System.out.print("Data da consulta (dd/mm/aaaa): ");
                String dataConsulta = scanner.nextLine();

                Paciente pacienteConsulta = hospital.buscarPaciente(nomePacienteConsulta);
                Medico medicoConsulta = hospital.buscarMedico(nomeMedicoConsulta);

                if (pacienteConsulta != null && medicoConsulta != null) {
                    DataConsulta consulta = new DataConsulta(dataConsulta, medicoConsulta);
                    medicoConsulta.marcarConsulta(consulta);
                    System.out.println("Consulta agendada com sucesso!");
                } else {
                    System.out.println("Paciente ou médico não encontrado. Verifique os dados informados.");
                }
                break;
                //nao funciona

            case 6:
                System.out.println("=== Cadastrar Mensalidade ===");
                System.out.print("Digite o nome do paciente: ");
                String nomePacienteMensalidade = scanner.nextLine();
                System.out.print("Valor da mensalidade: ");
                double valorMensalidade = scanner.nextDouble();
                scanner.nextLine(); // Consumir a quebra de linha após o próximoDouble()
                System.out.print("Data de vencimento da mensalidade (dd/mm/aaaa): ");
                String dataVencimentoMensalidade = scanner.nextLine();

                Paciente pacienteMensalidade = hospital.buscarPaciente(nomePacienteMensalidade);
                if (pacienteMensalidade != null) {
                    Mensalidade mensalidade = new Mensalidade(valorMensalidade, dataVencimentoMensalidade);
                    pacienteMensalidade.cadastrarMensalidade(mensalidade);
                    System.out.println("Mensalidade cadastrada com sucesso!");
                } else {
                    System.out.println("Paciente não encontrado. Verifique o nome informado.");
                }
                break;

            case 0:
                System.out.println("Encerrando o programa...");
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        System.out.println();
    }
}}}