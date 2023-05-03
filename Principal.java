package ico.fes.intro.Controllers;

import org.springFramework.stereotype.Controller;

@Controller
public class Principal{

    @GetMapping("/inicio")
    public String getInicio(Model model){
        empleado emp = new Empleado (1,"Jose Sosa", 23000, "Desarrollo","12/12/2000");
        model.addAttribute(attributeName"Empleado", emp);
        Return "index";
    }
}