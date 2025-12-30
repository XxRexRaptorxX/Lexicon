---
navigation:
  title: "Creaking Heart"
  icon: "minecraft:creaking_heart"
  parent: lexicon:rare_stuff.md
  item_ids:
    - minecraft:creaking_heart
---

# Creaking Heart

<ItemImage id="minecraft:creaking_heart" />

A <ItemLink id="minecraft:creaking_heart" /> is a rare living block. It can be crafted or found in naturally generated pale oak trees in pale gardens.
<ItemLink id="minecraft:creaking_heart" />'s drop as an item only when mined by a tool enchanted with [*Silk Touch*](../enchanting/enchantments.md#silk-touch). 
Otherwise, they drop <ItemLink id="minecraft:resin_clump" />'s.

<RecipesFor id="minecraft:creaking_heart" />

-----

## Activating a heart

It activates if placed in a line between pale oak blocks. If it's placed in the [*Overworld*](../world/dimensions.md#the-overworld) and it is night, a [*Creaking*](../creatures/monster-creaking.md) belonging to this
heart will spawn.

<GameScene interactive={true} zoom={2}>
  <Block x="0" y="2" z="0" id="minecraft:pale_oak_log" />
  <Block x="0" y="1" z="0" id="minecraft:creaking_heart" />
  <Block x="0" y="0" z="0" id="minecraft:pale_oak_log" />
</GameScene>

