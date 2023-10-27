package br.com.alura.loja.http;

import java.util.Map;
import java.util.Objects;

public interface HttpAdapter {
    void post(String url, Map<String, Object> dados);
}
