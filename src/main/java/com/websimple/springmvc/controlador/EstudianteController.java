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
	 * Este m�todo ser� llamado en el env�o de formularios, manejando solicitud de POST
	 * Tambi�n valida la entrada del usuario
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
	 * M�todo utilizado para rellenar la lista de Secci�n en vista.
	 * Aqu� se puede llamar a sistemas externos para proporcionar datos reales.
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
     * M�todo utilizado para rellenar la lista de pa�ses en la vista.
     * Aqu� se puede llamar a sistemas externos para proporcionar datos reales.
     */
	@ModelAttribute("paises")
	public List<String> inicializaPaises() {

		List<String> countries = new ArrayList<String>();
		countries.add("M�xico");
		countries.add("Canada");
		countries.add("Fancia");
		countries.add("Alemania");
		countries.add("Italia");
		countries.add("Otro");
		return countries;
	}

	/*
	 * M�todo utilizado para rellenar la lista de materias en la vista.
	 * Aqu� se puede llamar a sistemas externos para proporcionar datos reales.
	 */
	@ModelAttribute("ltmaterias")
	public List<String> inicializaMaterias() {

		List<String> subjects = new ArrayList<String>();
		subjects.add("F�sica");
		subjects.add("Qu�mica");
		subjects.add("Ciencias Naturales");
		subjects.add("Ciencias Politicas");
		subjects.add("Ciencias de la Computaci�n");
		subjects.add("Matematicas");
		return subjects;
	}
}