---
navigation:
  title: "Animal - Pig"
  icon: "minecraft:pig_spawn_egg"
  parent: lexicon:creatures.md
---

# Animal - Pig

__Health:__ 10     
__Attack Damage:__ 0    
__Behavior:__ Passive     
__Spawn:__ Overworld on grass       
__Breeding:__ <ItemLink id="minecraft:carrot"/>, <ItemLink id="minecraft:potato"/>, <ItemLink id="minecraft:beetroot"/>       
__Properties:__      
It is possible to ride a *Pig* by using a <ItemLink id="minecraft:saddle"/> on it. 
*Saddled pigs* are controllable with a <ItemLink id="minecraft:carrot_on_a_stick"/>. The *Pig* variant depends on the biome in which they spawn.

-----

## Warm Variant

<Row>
    <GameScene zoom={4} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:warm}" />
    </GameScene>

    <GameScene zoom={4} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:warm,equipment:{saddle:{id:saddle}}}" />
    </GameScene>

    <GameScene zoom={2} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:warm,Age:-1}" />
    </GameScene>
</Row>

## Temperate Variant

<Row>
    <GameScene zoom={4} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:temperate}" />
    </GameScene>

    <GameScene zoom={4} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:temperate,equipment:{saddle:{id:saddle}}}" />
    </GameScene>

    <GameScene zoom={2} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:temperate,Age:-1}" />
    </GameScene>
</Row>

## Cold Variant

<Row>
    <GameScene zoom={4} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:cold}" />
    </GameScene>

    <GameScene zoom={4} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:cold,equipment:{saddle:{id:saddle}}}" />
    </GameScene>

    <GameScene zoom={2} interactive={true}>
      <Entity id="minecraft:pig" data="{variant:cold,Age:-1}" />
    </GameScene>
</Row>

> __Drops:__ 1-3 <ItemLink id="minecraft:porkchop"/>, 1-3 <ItemLink id="minecraft:cooked_porkchop"/> if killed with fire  
> __XP:__ 1-3
