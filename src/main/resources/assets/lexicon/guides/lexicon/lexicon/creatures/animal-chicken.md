---
navigation:
  title: "Animal - Chicken"
  icon: "minecraft:chicken_spawn_egg"
  parent: lexicon:creatures.md
---

# Animal - Chicken

__Health:__ 4     
__Attack Damage:__ 0    
__Behavior:__ <Color id="blue">Passive</Color>      
__Spawn:__ Overworld on grass, 1/8 chance from a thrown <ItemLink id="minecraft:egg"/>        
__Breeding:__ Seeds     
__Properties:__      
Lay random <ItemLink id="minecraft:egg"/>*'s*. The *Chicken* variant depends on the biome in which they spawn.

-----

## Warm Variant

<Row>
    <GameScene zoom={5} interactive={true}>
      <Entity id="minecraft:chicken" data="{variant:warm}" />
    </GameScene>

    <GameScene zoom={3} interactive={true}>
      <Entity id="minecraft:chicken" data="{variant:warm,Age:-1}" />
    </GameScene>

    <ItemImage id="minecraft:brown_egg" />
</Row>

## Temperate Variant

<Row>
    <GameScene zoom={5} interactive={true}>
      <Entity id="minecraft:chicken" data="{variant:temperate}" />
    </GameScene>

    <GameScene zoom={3} interactive={true}>
      <Entity id="minecraft:chicken" data="{variant:temperate,Age:-1}" />
    </GameScene>

    <ItemImage id="minecraft:egg" />
</Row>

## Cold Variant

<Row>
    <GameScene zoom={5} interactive={true}>
      <Entity id="minecraft:chicken" data="{variant:cold}" />
    </GameScene>

    <GameScene zoom={3} interactive={true}>
      <Entity id="minecraft:chicken" data="{variant:cold,Age:-1}" />
    </GameScene>

    <ItemImage id="minecraft:blue_egg" />
</Row>

> __Drops:__ 0-2 <ItemLink id="minecraft:feather"/>*'s*, 1 <ItemLink id="minecraft:chicken"/>, 1 <ItemLink id="minecraft:cooked_chicken"/> if killed with fire  
> __XP:__ 1-3, 10 if part of a *Chicken Jockey*
