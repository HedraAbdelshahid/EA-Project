package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.models.Section;
import CS544.finalProject.backEnd.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlockController {

    @Autowired
    private BlockService blockService;

    @GetMapping("/")
    public String get(){
        return "Hello Block Controller";
    }

    @GetMapping("/a")
    public List<Block> findAll( ) {
        return blockService.findAll();
    }
}
