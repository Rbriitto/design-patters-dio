public class ConfigSingleton {

 // A instância privada da classe, inicialmente nula
 private static ConfigSingleton instance;

 // Atributos de configuração (pode ser qualquer configuração necessária para a aplicação)
 private String databaseUrl;
 private String apiKey;

 // Construtor privado para evitar a criação de instâncias externas
 private ConfigSingleton() {
     // Simulando carregamento de configurações
     this.databaseUrl = "jdbc:mysql://localhost:3306/mydb";
     this.apiKey = "12345-ABCDE";
 }

 // Método público para acessar a única instância da classe
 public static ConfigSingleton getInstance() {
     if (instance == null) {
         instance = new ConfigSingleton();
     }
     return instance;
 }

 // Métodos para acessar as configurações
 public String getDatabaseUrl() {
     return databaseUrl;
 }

 public String getApiKey() {
     return apiKey;
 }
}
