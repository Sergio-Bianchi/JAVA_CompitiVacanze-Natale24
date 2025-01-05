# Glossario DevOps e Cloud Computing

## Docker
- Software open-source per costruire, testare e distribuire applicazioni containerizzate
- Standardizza il deployment attraverso la containerizzazione delle applicazioni e delle loro dipendenze

## Container
- Unità che raggruppa il codice dell'applicazione con tutte le librerie e i file necessari
- Permette l'esecuzione su qualsiasi infrastruttura in modo consistente (Sul mio computer funziona, sul tuo no)

## Kubernetes
- Sistema di orchestrazione per gestire applicazioni e servizi containerizzati
- Gestisce scaling, deployment, bilanciamento del carico in ambiente containerizzato
- Offre portabilità, efficienza e funzionalità di integrazione sistema
- Si integra bene con Docker

## Azure DevOps
- Prodotto Microsoft che fornisce strumenti per lo sviluppo e il deployment software
- Facilita la collaborazione tra sviluppatori, project manager e altri contributori
- Integrabile con editor e IDE esistenti per progetti di ogni dimensione

## DevOps
- Combinazione di filosofie culturali, pratiche e strumenti
- Aumenta la capacità di un'organizzazione di distribuire applicazioni e servizi ad alta velocità
- Unisce sviluppo (Dev, development) e operazioni (Ops, operations) 

## Waterfall model
- Metodologia strutturata in fasi sequenziali
- Sei fasi: Requisiti, Design, Implementazione, Testing, Deployment e Manutenzione
- Processo lineare dove ogni fase dipende dal completamento della precedente

## Agile
- Promuove cicli di sviluppo brevi
- Favorisce il miglioramento continuo e la consegna rapida di valore agli utenti

## Microservices Architectures
- Architettura che divide le applicazioni in piccoli servizi indipendenti (Ad esempio con dei container)
- Richiede gestione di deployment più frequenti e monitoraggio distribuito
- Ha portato all'evoluzione delle pratiche DevOps

## Feedback
- Elemento cruciale per il miglioramento continuo
- Fondamentale per identificare e risolvere problemi precocemente

## Repository
- Storage per il codice sorgente
- Permette il tracciamento delle modifiche e la collaborazione
- L'esempio più popolare è git, creato da Linus Torvalds proprio per poter sviluppare il noto Kernel, il quale conta 30 milioni di righe di codice ad oggi

## Jenkins
- Strumento popolare per CI/CD
- Automatizza build, test e deployment
- Facilita l'integrazione continua del codice

## Terraform
- Tool per Infrastructure as Code
- Permette di trattare l'infrastruttura come codice applicativo
- Automatizza il provisioning di server e risorse cloud

## Server Provisioning
- Processo automatizzato di preparazione server
- Include creazione server da template e configurazione networking
- Utilizza strumenti come Terraform e Cloud Formation

## Configuration Management
- Gestione automatizzata dell'installazione e configurazione software
- Utilizza strumenti come Chef, Puppet, Ansible
- Mantiene consistenza tra ambienti e previene configuration drift (Pc di casa != pc lavoro)

