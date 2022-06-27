(ns main) ;namespace  ou package 

;console.log(Explodindo a cabeça tentando entender uma linguagem funcional) = Baseado em C
(js/console.log "Hello world!") ;Baseado em LISP 

;criando uma fuction
(def rufino-log-prefix "ds: ")
(defn rufino-log [mensagem]
  (prn (str rufino-log-prefix mensagem)))

(rufino-log "hello world!")