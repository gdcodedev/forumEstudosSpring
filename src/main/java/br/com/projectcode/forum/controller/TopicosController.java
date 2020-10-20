package br.com.projectcode.forum.controller;

import br.com.projectcode.forum.controller.dto.TopicoDto;
import br.com.projectcode.forum.modelo.Curso;
import br.com.projectcode.forum.modelo.Topico;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicosController {

    @RequestMapping("/topicos")
    @ResponseBody
    public List<TopicoDto> lista() {
        Topico topico = new Topico("Dúvida", "Dúvida com Spring",  new Curso("Spring","Programação"));

        return TopicoDto.converter(Arrays.asList(topico,topico,topico));




    }

}
