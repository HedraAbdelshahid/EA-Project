package CS544.finalProject.backEnd.controllers;

import CS544.finalProject.backEnd.config.AppConfig;
import CS544.finalProject.backEnd.exceptions.ResourceNotFoundException;
import CS544.finalProject.backEnd.models.Block;
import CS544.finalProject.backEnd.services.BlockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class BlockController {

    @Autowired
    private BlockService blockService;

    @GetMapping(AppConfig.BLOCKS)
    public List<Block> getAllCourse() {
        return blockService.findAll();
    }

    @GetMapping(AppConfig.BLOCKS + "/{blockId}")
    public Block getCourseById(@PathVariable Long blockId) {

        return blockService.findById(blockId).orElseThrow(() -> new ResourceNotFoundException("Block Not Found"));
    }

    @PostMapping(AppConfig.BLOCKS)
    public Block addCourse(@RequestBody Block course) {
        return blockService.save(course);
    }

    @PutMapping(AppConfig.BLOCKS)
    public Block updateCourse(@RequestBody Block course) {
        return blockService.update(course);
    }

    @DeleteMapping(AppConfig.BLOCKS + "/{blockId}")
    public void delete(@PathVariable Long blockId) {
        blockService.delete(blockId);
    }


}
