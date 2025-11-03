## Zulrah Auto Prayer Switch - Relatório de Progresso

### Visão Geral
O desenvolvimento do `ZulrahAutoPrayerScript` está avançando de forma constante. Este script foi projetado para ativar automaticamente a oração de proteção correta durante o combate contra o Zulrah, com base na detecção de projéteis recebidos. O escopo atual está limitado apenas à troca de orações, servindo como base para futuras expansões.

### Conquistas Até Agora
- Estruturação das classes principais:
  - `ZulrahAutoPrayerScript`: lógica principal de detecção de projéteis e troca de orações.
  - `ZulrahAutoPrayerPlugin`: inicialização e finalização do plugin.
  - `ZulrahProjectileDetector`: detecção do tipo de projétil para decidir qual oração ativar.
  - `ZulrahAutoPrayerConfig`: configuração de preferências do usuário.
- Integração com as APIs do RuneLite e abstrações do Microbot para manipulação de orações via `Rs2Prayer`.
- Implementação do modelo de eventos para escutar a aparição de projéteis.
- Código modular visando futura reutilização e expansão.

### Dificuldades Atuais
- Problemas na fase de testes do plugin, seja por limitações do ambiente ou conflitos ainda desconhecidos.
- A depuração está limitada, pois o feedback visual das trocas de orações é difícil de observar sem interações em tempo real.
- Necessidade de apoio da comunidade para integração e testes completos no ambiente do Microbot.

### Próximos Passos
Para progredir, é necessário:
- Validar as assinaturas de eventos e a troca de orações durante um combate real contra Zulrah.
- Garantir compatibilidade com o agendador de scripts e renderizações do Microbot.
- Obter feedbacks e logs quando as orações não forem trocadas como esperado.

### Considerações Finais
Mesmo que este script esteja focado apenas no Zulrah, ele pode servir como prova de conceito. Após validação, a mesma arquitetura poderá ser utilizada para outros bosses, como o Jad ou o Inferno, que também exigem mudanças rápidas de oração.

Contribuições e ajuda com testes são bem-vindas. A colaboração agora será decisiva para o sucesso e escalabilidade desta ferramenta.
