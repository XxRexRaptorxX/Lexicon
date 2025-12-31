---
navigation:
  title: "Boss - Wither"
  icon: "minecraft:wither_skeleton_skull"
  parent: lexicon:creatures.md
---

# Boss - Wither

__Health:__ 300 + 4 Armor   
__Attack Damage:__  
 - 5 on easy
 - 8 on normal + 10 [Wither damage](../brewing/effects.md#wither) 
 - 12 on hard + 40 [Wither damage](../brewing/effects.md#wither)     


__Behavior:__ <Color id="red">Hostile</Color>      
__Spawn:__ When created by the [*Player*](./human-player.md)    
__Properties:__      
The *Wither* has a passive regeneration rate of 1 every second, and a direct killing blow on a target instantly heals 5. When its health drops below half, the wither gains a natural wither armor effect, which makes it immune to damage from arrows and thrown tridents. The armor disappears if it regenerates above half health. It rapidly fires explosive projectiles that destroy the terrain. It's a undead mob.

-----

## Wither

<GameScene zoom={3} interactive={true}>
  <Entity id="minecraft:wither" />
</GameScene>

> __Drops:__ 1 Nether Star   
> __XP:__ 50

-----

How to summon a *Wither*:

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="2" z="0" id="minecraft:wither_skeleton_skull"p:rotation="0" />
  <Block x="1" y="2" z="0" id="minecraft:wither_skeleton_skull"p:rotation="0" />
  <Block x="2" y="2" z="0" id="minecraft:wither_skeleton_skull"p:rotation="0" />
  <Block x="0" y="1" z="0" id="minecraft:soul_sand" />
  <Block x="1" y="1" z="0" id="minecraft:soul_sand" />
  <Block x="2" y="1" z="0" id="minecraft:soul_sand" />
  <Block x="1" y="0" z="0" id="minecraft:soul_sand" />
</GameScene>


