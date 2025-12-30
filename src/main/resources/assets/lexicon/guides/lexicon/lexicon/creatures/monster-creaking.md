---
navigation:
  title: "Monster - Creaking"
  icon: "minecraft:creaking_spawn_egg"
  parent: lexicon:creatures.md
---

# Monster - Creaking

__Health:__ 1  
__Attack Damage:__  
 - 2.5 on easy
 - 3 on normal
 - 4.5 on hard    

__Behavior:__ Hostile    
__Spawn:__ At night by an activated *Creaking Heart*, Pale Garden      
__Properties:__      
It is protected from **all** damage by the *Creaking Heart* that spawned it. Breaking the *Creaking Heart* instantly kills the *Creaking*. The heart of this monster naturally generates in Pale Oak tree trunks. 
When the *Creaking* is struck, the particles reveal the direction in which the heart is located. This monster only moves when you don't have it in your field of vision.

-----

## Creaking

<GameScene zoom={4} interactive={true}>
  <Entity id="minecraft:creaking" />
</GameScene>

> __Drops:__ -  
> __XP:__ -

-----

You can also activate a *Creaking Heart* yourself. To do this, the heart must be placed between pale oak blocks in the same orientation. However, it must be in the [*Overworld*](../world/dimensions.md#the-overworld) and it must 
be nighttime.

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="2" z="0" id="minecraft:pale_oak_log" />
  <Block x="0" y="1" z="0" id="minecraft:creaking_heart" />
  <Block x="0" y="0" z="0" id="minecraft:pale_oak_log" />
</GameScene>

<Recipe id="minecraft:creaking_heart" />

