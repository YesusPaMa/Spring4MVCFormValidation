package com.websimple.springmvc.controlador;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.websimple.springmvc.modelo.Estudiante;

@Controller
public class EstudianteController {
    @RequestMapping(path= "/",method=RequestMethod.GET)    
    public String greet(ModelMap model){
        Estudiante estudiante = new Estudiante();
		model.addAttribute("estudiante", estudiante);
        return "matricular";
    }
    
    /*
	 * Este método será llamado en el envío de formularios, manejando solicitud de POST
	 * También valida la entrada del usuario
	 */
	@RequestMapping(path= "/",method = RequestMethod.POST)
	public String guardarRegistro(@Valid Estudiante estudiante, BindingResult resultado, ModelMap modelo){

		if(resultado.hasErrors()) {
			return "matricular";
		}

		modelo.addAttribute("success", "Estimado "+ estudiante.getNombre()+", se registro correctamente.");
		return "success";
	}
    
    /*
	 * Método utilizado para rellenar la lista de Sección en vista.
	 * Aquí se puede llamar a sistemas externos para proporcionar datos reales.
	 */
	@ModelAttribute("niveles")
	public List<String> inicializaNiveles() {

		List<String> sections = new ArrayList<String>();
		sections.add("Licenciatura");
		sections.add("Maestria");
		sections.add("Doctorado");
		return sections;
	}

    /*
     * Método utilizado para rellenar la lista de países en la vista.
     * Aquí se puede llamar a sistemas externos para proporcionar datos reales.
     */
	@ModelAttribute("paises")
	public List<String> inicializaPaises() {

		List<String> countries = new ArrayList<String>();
		countries.add("México");
		countries.add("Canada");
		countries.add("Fancia");
		countries.add("Alemania");
		countries.add("Italia");
		countries.add("Otro");
		return countries;
	}

	/*
	 * Método utilizado para rellenar la lista de materias en la vista.
	 * Aquí se puede llamar a sistemas externos para proporcionar datos reales.
	 */
	@ModelAttribute("ltmaterias")
	public List<String> inicializaMaterias() {

		List<String> subjects = new ArrayList<String>();
		subjects.add("Física");
		subjects.add("Química");
		subjects.add("Ciencias Naturales");
		subjects.add("Ciencias Politicas");
		subjects.add("Ciencias de la Computación");
		subjects.add("Matematicas");
		return subjects;
	}
}