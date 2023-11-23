package com.example.demo;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class FormatarCPFAspect {

    @Pointcut("execution(public * *(..))")
    private void anyPublicOperation() {
    }

    @Around("@annotation(formatarCPF) && execution(* *(..)) )")
    public Object formatarCPFAntesDaChamada(ProceedingJoinPoint joinPoint, FormatarCPF formatarCPF) throws Throwable {
        Object result = joinPoint.proceed();
        formatarCPF.value();
        if (result instanceof Pessoa) {
            Pessoa pessoa = (Pessoa) result;
            pessoa.setCpf(formatarCPF(pessoa.getCpf()));
        }
    return result;
    }

    private String formatarCPF(String cpf) {
        // Lógica de formatação do CPF (exemplo simples)
        // Aqui você pode implementar a lógica específica de formatação
        return cpf.replaceAll("(\\d{3})(\\d{3})(\\d{3})(\\d{2})", "$1.$2.$3-$4");
    }
}