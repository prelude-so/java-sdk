# Changelog

## 0.1.0-beta.1 (2025-01-14)

Full Changelog: [v0.1.0-alpha.1...v0.1.0-beta.1](https://github.com/prelude-so/java-sdk/compare/v0.1.0-alpha.1...v0.1.0-beta.1)

### ⚠ BREAKING CHANGES

* **client:** switch query params objects to use `QueryParams` ([#20](https://github.com/prelude-so/java-sdk/issues/20))

### Features

* **api:** update via SDK Studio ([#12](https://github.com/prelude-so/java-sdk/issues/12)) ([55fa1e7](https://github.com/prelude-so/java-sdk/commit/55fa1e715b915fee246a6190450daeccee0e6619))
* **api:** update via SDK Studio ([#14](https://github.com/prelude-so/java-sdk/issues/14)) ([543556d](https://github.com/prelude-so/java-sdk/commit/543556d76a218536407429f8019ad1be24774be8))
* **api:** update via SDK Studio ([#28](https://github.com/prelude-so/java-sdk/issues/28)) ([8b23736](https://github.com/prelude-so/java-sdk/commit/8b23736f2fbdc9cd91457abcd7e6d61c79b21e71))
* **api:** update via SDK Studio ([#34](https://github.com/prelude-so/java-sdk/issues/34)) ([87417e9](https://github.com/prelude-so/java-sdk/commit/87417e9e78d7e6d79b6a1b903eb9f19707b56274))
* **api:** update via SDK Studio ([#6](https://github.com/prelude-so/java-sdk/issues/6)) ([0998d04](https://github.com/prelude-so/java-sdk/commit/0998d043db0c0ac429790affaaddd10f1ad212f1))
* **client:** add logging when debug env is set ([#10](https://github.com/prelude-so/java-sdk/issues/10)) ([a812025](https://github.com/prelude-so/java-sdk/commit/a8120256c1a18c45d8ce67e6d6b686b776e7ba1b))
* **client:** add various convenience setters to models ([#27](https://github.com/prelude-so/java-sdk/issues/27)) ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))
* **client:** allow passing null or optional for nullable fields ([#25](https://github.com/prelude-so/java-sdk/issues/25)) ([c139ffd](https://github.com/prelude-so/java-sdk/commit/c139ffd974470937e65b082962ce9eb212d1452c))
* **client:** allow setting arbitrary JSON for top-level body params ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))
* **client:** expose getters for `JsonField` of body params ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))


### Bug Fixes

* **client:** add some missing `validate()` calls ([#30](https://github.com/prelude-so/java-sdk/issues/30)) ([1849964](https://github.com/prelude-so/java-sdk/commit/1849964aa9055f39fe2a2826a567dc60f60ab013))
* **client:** consistently throw on omitting required fields ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))
* **client:** convert `JsonField` containing list type to mutable in builder ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))


### Chores

* **deps:** bump jackson to 2.18.1 ([#7](https://github.com/prelude-so/java-sdk/issues/7)) ([336af73](https://github.com/prelude-so/java-sdk/commit/336af73d2e2a326f68722fdf3b13a67c9d4f2b9a))
* **docs:** add example project ([#18](https://github.com/prelude-so/java-sdk/issues/18)) ([3e28680](https://github.com/prelude-so/java-sdk/commit/3e2868070438b93053a9ec2cbdfb07665b469868))
* **docs:** fix code block language ([#19](https://github.com/prelude-so/java-sdk/issues/19)) ([4cf9880](https://github.com/prelude-so/java-sdk/commit/4cf9880acac10fae48a5a34225c7d403d1bff0b0))
* **docs:** update readme ([#17](https://github.com/prelude-so/java-sdk/issues/17)) ([006f23a](https://github.com/prelude-so/java-sdk/commit/006f23a50cf696706de7f87a5a65199e0ae341a1))
* **internal:** codegen related update ([#11](https://github.com/prelude-so/java-sdk/issues/11)) ([c652afe](https://github.com/prelude-so/java-sdk/commit/c652afe830e5295f51b419c5720be086c47ad443))
* **internal:** codegen related update ([#13](https://github.com/prelude-so/java-sdk/issues/13)) ([56b5363](https://github.com/prelude-so/java-sdk/commit/56b536383b0ed3e54a0570a6b1390cb2c0bb1167))
* **internal:** codegen related update ([#15](https://github.com/prelude-so/java-sdk/issues/15)) ([b943cf3](https://github.com/prelude-so/java-sdk/commit/b943cf3d7ac31090a55eb93194197c2b701e0d00))
* **internal:** codegen related update ([#16](https://github.com/prelude-so/java-sdk/issues/16)) ([e8ccf93](https://github.com/prelude-so/java-sdk/commit/e8ccf931fa3677682f5b68093340ef1ccf223b67))
* **internal:** codegen related update ([#22](https://github.com/prelude-so/java-sdk/issues/22)) ([94786d8](https://github.com/prelude-so/java-sdk/commit/94786d853b753b826f4857a2eab137366546a44e))
* **internal:** codegen related update ([#23](https://github.com/prelude-so/java-sdk/issues/23)) ([f03b626](https://github.com/prelude-so/java-sdk/commit/f03b6266dba10da47086b991c939b892ae883ea5))
* **internal:** codegen related update ([#29](https://github.com/prelude-so/java-sdk/issues/29)) ([297d3f6](https://github.com/prelude-so/java-sdk/commit/297d3f69ad737dea708d130963500eb8e4d26f62))
* **internal:** codegen related update ([#8](https://github.com/prelude-so/java-sdk/issues/8)) ([468713d](https://github.com/prelude-so/java-sdk/commit/468713d67bbbfa0184d65ab3bc3cda1e37f65174))
* **internal:** codegen related update ([#9](https://github.com/prelude-so/java-sdk/issues/9)) ([5880887](https://github.com/prelude-so/java-sdk/commit/58808873dd14df04c0f748680bedc46ad74abe3c))
* **internal:** extract a `checkRequired` function ([#33](https://github.com/prelude-so/java-sdk/issues/33)) ([2867684](https://github.com/prelude-so/java-sdk/commit/286768481c4940a4c7bc5f1f5f6fff7debfec72b))
* **internal:** refactor `validate` methods ([1849964](https://github.com/prelude-so/java-sdk/commit/1849964aa9055f39fe2a2826a567dc60f60ab013))
* **internal:** remove unused Gradle imports ([#31](https://github.com/prelude-so/java-sdk/issues/31)) ([64c6d13](https://github.com/prelude-so/java-sdk/commit/64c6d131d096bcbabd290eaf21ee3d2e3c68bc85))
* **internal:** remove unused or unnecessary Gradle imports ([#32](https://github.com/prelude-so/java-sdk/issues/32)) ([e27bafe](https://github.com/prelude-so/java-sdk/commit/e27bafeebe69c376b2f4a7f4f045026facf8a853))
* rebuild project due to codegen change ([#4](https://github.com/prelude-so/java-sdk/issues/4)) ([5e6bd27](https://github.com/prelude-so/java-sdk/commit/5e6bd275b6bfa94999b4d9a8233bd75eaddbec4b))


### Documentation

* add params class javadocs ([#26](https://github.com/prelude-so/java-sdk/issues/26)) ([f5509ab](https://github.com/prelude-so/java-sdk/commit/f5509ab8d9fa10644f77f2e5ae31ef206a48d611))


### Styles

* **internal:** explicitly add some method return types ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))
* **internal:** move headers and query params setters below others ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))
* **internal:** simplify existing convenience setters on params ([43f12a3](https://github.com/prelude-so/java-sdk/commit/43f12a33ffd8ce4fc785fe91c9705da15b3af625))
* **internal:** sort fields ([#24](https://github.com/prelude-so/java-sdk/issues/24)) ([d3585a5](https://github.com/prelude-so/java-sdk/commit/d3585a51a922ca53da0cd34ebc170e059fcd8181))


### Refactors

* **client:** switch query params objects to use `QueryParams` ([#20](https://github.com/prelude-so/java-sdk/issues/20)) ([79a39e6](https://github.com/prelude-so/java-sdk/commit/79a39e6a2656d01806fe7333d97b99d07d10d72d))
* **internal:** use constructor to deserialize json ([#21](https://github.com/prelude-so/java-sdk/issues/21)) ([fc6650e](https://github.com/prelude-so/java-sdk/commit/fc6650ec969ba2f1a0be23f41b5b781f83c555ca))

## 0.1.0-alpha.1 (2024-11-13)

Full Changelog: [v0.0.1-alpha.0...v0.1.0-alpha.1](https://github.com/prelude-so/java-sdk/compare/v0.0.1-alpha.0...v0.1.0-alpha.1)

### Features

* **api:** update via SDK Studio ([c7c4177](https://github.com/prelude-so/java-sdk/commit/c7c4177a13bef7b7771cc14c096db33ede3c0d74))
* **api:** update via SDK Studio ([7da3958](https://github.com/prelude-so/java-sdk/commit/7da3958c133b688d8edf401cde7556550a6f078b))
* **api:** update via SDK Studio ([9d17d9d](https://github.com/prelude-so/java-sdk/commit/9d17d9dd876b86fee4780f8e666b8bee1b8bdb2c))
* **api:** update via SDK Studio ([351b712](https://github.com/prelude-so/java-sdk/commit/351b712d63b7871f76ab2ba79957bc5b226a295b))
* **api:** update via SDK Studio ([b32870c](https://github.com/prelude-so/java-sdk/commit/b32870cbe1c7fddf85b9e21c8db88cf26b847336))


### Chores

* go live ([#2](https://github.com/prelude-so/java-sdk/issues/2)) ([943efb6](https://github.com/prelude-so/java-sdk/commit/943efb6c94cc7e40f7b97aa64132e2c91fa7c325))
