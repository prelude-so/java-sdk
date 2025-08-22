# Changelog

## 0.7.0 (2025-08-22)

Full Changelog: [v0.6.0...v0.7.0](https://github.com/prelude-so/java-sdk/compare/v0.6.0...v0.7.0)

### Features

* add retryable exception ([a3751d1](https://github.com/prelude-so/java-sdk/commit/a3751d1540ebfa05102ebef2e13d87120039926c))
* **api:** api update ([ac82763](https://github.com/prelude-so/java-sdk/commit/ac82763387c8e536b6625b9f5748f28dad670e18))
* **api:** update via SDK Studio ([05d7d0e](https://github.com/prelude-so/java-sdk/commit/05d7d0e97100d46a5dcd928943fd531669942c81))
* **client:** add `{QueryParams,Headers}#put(String, JsonValue)` methods ([357aeda](https://github.com/prelude-so/java-sdk/commit/357aeda6ead54ae0e5a04919ebbe23bf06ae4089))
* **client:** add https config options ([dfbdf92](https://github.com/prelude-so/java-sdk/commit/dfbdf92410d52ff79134a52af6a700255c44e523))
* **client:** allow configuring env via system properties ([2a2d667](https://github.com/prelude-so/java-sdk/commit/2a2d667a5cb0b725df3f536e5375da8dd580dd15))
* **client:** ensure compat with proguard ([ea6c8cd](https://github.com/prelude-so/java-sdk/commit/ea6c8cd93e7badd1afb21f95c4b4409a91426e91))


### Bug Fixes

* **ci:** release-doctor — report correct token name ([13a503f](https://github.com/prelude-so/java-sdk/commit/13a503fd0a97619293d536bc25fe9e63a70d63d2))
* **client:** don't close client on `withOptions` usage when original is gc'd ([e3e197f](https://github.com/prelude-so/java-sdk/commit/e3e197f8fae4362cb000303e4825588c0e06977a))
* **client:** ensure error handling always occurs ([26bf51c](https://github.com/prelude-so/java-sdk/commit/26bf51c661c8d4df21d93f067b920654bcc2b310))
* **client:** r8 support ([2e92b1e](https://github.com/prelude-so/java-sdk/commit/2e92b1e3e8305fa0fb971e45de01d83f1cc36c2a))


### Performance Improvements

* **internal:** make formatting faster ([3bca64c](https://github.com/prelude-so/java-sdk/commit/3bca64c2b3404424ca8c47d5cb67e028c73bc3cc))


### Chores

* **ci:** add build job ([181072f](https://github.com/prelude-so/java-sdk/commit/181072f2bcbc7ddcc94744cadaa4687ea7849174))
* **ci:** bump `actions/setup-java` to v4 ([7d1f671](https://github.com/prelude-so/java-sdk/commit/7d1f6717e6ce4b61eaeb66b1d47ffadbfa5be454))
* **ci:** ensure docs generation always succeeds ([89494ea](https://github.com/prelude-so/java-sdk/commit/89494ea07c90412a02c70d2c7a61c752c398e606))
* **ci:** only run for pushes and fork pull requests ([5acd1d3](https://github.com/prelude-so/java-sdk/commit/5acd1d32ca11e01c29af6726933c7a956b2f09ac))
* **ci:** reduce log noise ([bcbc916](https://github.com/prelude-so/java-sdk/commit/bcbc916f0859187df38c264c43b9c66ec002ed55))
* **client:** refactor closing / shutdown ([b477fcb](https://github.com/prelude-so/java-sdk/commit/b477fcb880aba2528c6a57cbaa2276f48551b514))
* **example:** fix run example comment ([d6ed233](https://github.com/prelude-so/java-sdk/commit/d6ed233042b24af0555f98e5849992ceae6761a7))
* increase max gradle JVM heap to 8GB ([8a6c9c5](https://github.com/prelude-so/java-sdk/commit/8a6c9c58085584c6bf4b7e5d119d052b5c11ef44))
* **internal:** add async lock helper ([d85beae](https://github.com/prelude-so/java-sdk/commit/d85beae9c43293919652260162da9bee5b121d44))
* **internal:** allow running specific example from cli ([bd89c57](https://github.com/prelude-so/java-sdk/commit/bd89c5713ade2738b1ef0885d5f3565fbe49c6ef))
* **internal:** bump ci test timeout ([274ef6f](https://github.com/prelude-so/java-sdk/commit/274ef6f378cdc6a18062fd7a7f767be2e0885dc8))
* **internal:** dynamically determine included projects ([5d1a730](https://github.com/prelude-so/java-sdk/commit/5d1a7304e3ee63474a07dfc0e70000082481207d))
* **internal:** format identity methods ([6ac725f](https://github.com/prelude-so/java-sdk/commit/6ac725fbf46c06bca4b7b8cd2fa4f4bb6da6a400))
* **internal:** reduce proguard ci logging ([b8bc048](https://github.com/prelude-so/java-sdk/commit/b8bc0485deb4a8554c6efef4ddc1f9ffa8c1f8ef))
* **internal:** refactor delegating from client to options ([c53e5b8](https://github.com/prelude-so/java-sdk/commit/c53e5b84bcf98b7b713993b9d30d141b4408ce7e))
* **internal:** remove unnecessary `[...]` in `[@see](https://github.com/see)` ([b0a34a1](https://github.com/prelude-so/java-sdk/commit/b0a34a1e51d69333ce0fd67793e079c8d5249426))
* **internal:** support passing arguments to test script ([1684381](https://github.com/prelude-so/java-sdk/commit/1684381e5751595696632b0d8838e196bd7a90f2))
* **internal:** support running formatters directly ([e74cc96](https://github.com/prelude-so/java-sdk/commit/e74cc966be8a882790885cd919d12fcaca81eeca))
* **internal:** update comment in script ([fc668ac](https://github.com/prelude-so/java-sdk/commit/fc668aca5396d41e495d8c74265d2046b50b2315))
* **internal:** update test skipping reason ([4912d8e](https://github.com/prelude-so/java-sdk/commit/4912d8e75ebdb7118e6214136f2961595685ae89))
* remove memory upper bound from publishing step ([77b8fe3](https://github.com/prelude-so/java-sdk/commit/77b8fe35800d66facf78071b795a0bd8878f12ea))
* update @stainless-api/prism-cli to v5.15.0 ([88986e3](https://github.com/prelude-so/java-sdk/commit/88986e30960d5cc6fde5f312aab0863cd19d648d))


### Documentation

* fix missing readme comment ([6f95540](https://github.com/prelude-so/java-sdk/commit/6f9554069aa8a8eea3fc934b90da2a67646a0e3b))
* more code comments ([364e143](https://github.com/prelude-so/java-sdk/commit/364e143b14eb2fc2354bf98b2b19007da4dcdcf1))


### Refactors

* **internal:** minor `ClientOptionsTest` change ([e017858](https://github.com/prelude-so/java-sdk/commit/e0178588c5f5ce326ea910f648ecfb1799cb3ca8))

## 0.6.0 (2025-06-23)

Full Changelog: [v0.5.0...v0.6.0](https://github.com/prelude-so/java-sdk/compare/v0.5.0...v0.6.0)

### Features

* **client:** add a `withOptions` method ([66c2b6f](https://github.com/prelude-so/java-sdk/commit/66c2b6fe83c33f09a6c39b3318ccaf10aca25956))
* **client:** implement per-endpoint base URL support ([26d9ec8](https://github.com/prelude-so/java-sdk/commit/26d9ec832a078df08e1557a337530ee2596ad6c6))


### Bug Fixes

* **client:** bump max requests per host to max requests (5 -&gt; 64) ([c9ecf45](https://github.com/prelude-so/java-sdk/commit/c9ecf45da5d98a0d1a678a74683d90143560ad81))


### Chores

* **ci:** enable for pull requests ([94b02c4](https://github.com/prelude-so/java-sdk/commit/94b02c441b54022c8d63eab6febe76e7ba2d72da))

## 0.5.0 (2025-06-02)

Full Changelog: [v0.4.0...v0.5.0](https://github.com/prelude-so/java-sdk/compare/v0.4.0...v0.5.0)

### Features

* **api:** update via SDK Studio ([f266567](https://github.com/prelude-so/java-sdk/commit/f266567129e61db748394695be867d17f6d3efb8))


### Bug Fixes

* **client:** remove `@MustBeClosed` for future returning methods ([dfc3b84](https://github.com/prelude-so/java-sdk/commit/dfc3b845591011d54a30c95b816508f9187bfa5a))


### Chores

* **docs:** grammar improvements ([b03d574](https://github.com/prelude-so/java-sdk/commit/b03d574c3bbd7229591c73569541fa67e2436426))

## 0.4.0 (2025-05-13)

Full Changelog: [v0.3.0...v0.4.0](https://github.com/prelude-so/java-sdk/compare/v0.3.0...v0.4.0)

### ⚠ BREAKING CHANGES

* **client:** extract auto pagination to shared classes
* **client:** **Migration:** - If you were referencing the `AutoPager` class on a specific `*Page` or `*PageAsync` type, then you should instead reference the shared `AutoPager` and `AutoPagerAsync` types, under the `core` package
    - `AutoPagerAsync` now has different usage. You can call `.subscribe(...)` on the returned object instead to get called back each page item. You can also call `onCompleteFuture()` to get a future that completes when all items have been processed. Finally, you can call `.close()` on the returned object to stop auto-paginating early
    - If you were referencing `getNextPage` or `getNextPageParams`:
       - Swap to `nextPage()` and `nextPageParams()`
       - Note that these both now return non-optional types (use `hasNextPage()` before calling these, since they will throw if it's impossible to get another page)

### Features

* **api:** update via SDK Studio ([dd3d6ad](https://github.com/prelude-so/java-sdk/commit/dd3d6ad8e9e61fe05cee692c71311e71ac314fe5))
* **client:** allow providing some params positionally ([05f45f3](https://github.com/prelude-so/java-sdk/commit/05f45f3434a9f0de216cec338ffa499ee010e73c))
* **client:** extract auto pagination to shared classes ([7e51ebc](https://github.com/prelude-so/java-sdk/commit/7e51ebc64079d1ce7549ce9cc3b21492b0fef0f5))


### Performance Improvements

* **internal:** improve compilation+test speed ([85c53e5](https://github.com/prelude-so/java-sdk/commit/85c53e5a10af6d7707ddbb8c4abc607409504efb))


### Chores

* **ci:** add timeout thresholds for CI jobs ([af7a95d](https://github.com/prelude-so/java-sdk/commit/af7a95d1587f241500659bc6180dfec06daf9487))
* **ci:** only use depot for staging repos ([dbeb5eb](https://github.com/prelude-so/java-sdk/commit/dbeb5eb2dce0744be8430bb75aa561a8c1b0aeda))
* **ci:** run on more branches and use depot runners ([a6a1964](https://github.com/prelude-so/java-sdk/commit/a6a1964a7156bcba13d30a784083f09d6cac39ac))
* **internal:** java 17 -&gt; 21 on ci ([4df8bf1](https://github.com/prelude-so/java-sdk/commit/4df8bf18595b847d63b24434ced5cb43c3c81b8c))
* **internal:** remove flaky `-Xbackend-threads=0` option ([61327dd](https://github.com/prelude-so/java-sdk/commit/61327dde5843aadd99fecdc1b594b3b82ef4ecfd))
* **internal:** update java toolchain ([3f69cd3](https://github.com/prelude-so/java-sdk/commit/3f69cd34a86615e94d5fc04349ae64255afc5c5d))


### Documentation

* **client:** update jackson compat error message ([baba4df](https://github.com/prelude-so/java-sdk/commit/baba4df213abca5ee86da2fff25036be9429bda0))
* explain http client customization ([54858cc](https://github.com/prelude-so/java-sdk/commit/54858cc612ea274f70a1326d02d1ea471dce51b1))
* explain jackson compat in readme ([ddc293e](https://github.com/prelude-so/java-sdk/commit/ddc293eab99bd06e99788a29a9190012e347fa33))
* update documentation links to be more uniform ([cba387a](https://github.com/prelude-so/java-sdk/commit/cba387afc144b663148b491cda78436e0a3c72b3))

## 0.3.0 (2025-04-11)

Full Changelog: [v0.2.0...v0.3.0](https://github.com/prelude-so/java-sdk/compare/v0.2.0...v0.3.0)

### ⚠ BREAKING CHANGES

* **client:** refactor exception structure and methods ([#113](https://github.com/prelude-so/java-sdk/issues/113))

### Features

* **api:** update via SDK Studio ([8d5019f](https://github.com/prelude-so/java-sdk/commit/8d5019f63142974d537df4a628603df68bda9c10))
* **api:** update via SDK Studio ([b3d8ee8](https://github.com/prelude-so/java-sdk/commit/b3d8ee84b8563b498bb470d153a09c5c3425868a))
* **client:** add enum validation method ([f505739](https://github.com/prelude-so/java-sdk/commit/f505739e95f15b012fc4f6e7c461a38749f36039))
* **client:** expose request body setter and getter ([#125](https://github.com/prelude-so/java-sdk/issues/125)) ([638a799](https://github.com/prelude-so/java-sdk/commit/638a799ae7510a5772b8a0678f1df53e19a3ce92))
* **client:** make union deserialization more robust ([#123](https://github.com/prelude-so/java-sdk/issues/123)) ([f505739](https://github.com/prelude-so/java-sdk/commit/f505739e95f15b012fc4f6e7c461a38749f36039))
* **client:** support a lower jackson version ([#119](https://github.com/prelude-so/java-sdk/issues/119)) ([1190992](https://github.com/prelude-so/java-sdk/commit/1190992b68ef236c0e1d7ef0f17c7822cf3976ba))
* **client:** support setting base URL via env var ([#131](https://github.com/prelude-so/java-sdk/issues/131)) ([bdb10bb](https://github.com/prelude-so/java-sdk/commit/bdb10bbee92e0a7ecc0987e4f1a098c5bd1afa68))
* **client:** throw on incompatible jackson version ([1190992](https://github.com/prelude-so/java-sdk/commit/1190992b68ef236c0e1d7ef0f17c7822cf3976ba))


### Bug Fixes

* **client:** bump to better jackson version ([#133](https://github.com/prelude-so/java-sdk/issues/133)) ([26e1917](https://github.com/prelude-so/java-sdk/commit/26e1917223e7ae3f3b12b82535eca52b7cf723d6))
* **client:** don't call `validate()` during deserialization if we don't have to ([#121](https://github.com/prelude-so/java-sdk/issues/121)) ([8278a87](https://github.com/prelude-so/java-sdk/commit/8278a87abfb1d3abb688350156f46d19b33a55c2))
* **client:** limit json deserialization coercion ([#122](https://github.com/prelude-so/java-sdk/issues/122)) ([9c84e96](https://github.com/prelude-so/java-sdk/commit/9c84e96db9e6f0a9fafa0dac178bf6b28f61fd4f))
* **client:** map deserialization bug ([fba5a3d](https://github.com/prelude-so/java-sdk/commit/fba5a3d8184321e2f18ef24fe2c3e276094a10ab))
* **client:** return `Optional&lt;T&gt;` instead of `Optional<? extends T>` ([#128](https://github.com/prelude-so/java-sdk/issues/128)) ([4d0542f](https://github.com/prelude-so/java-sdk/commit/4d0542f0658afbd81edfc0d99dbc748ded112489))
* **client:** support kotlin 1.8 runtime ([#111](https://github.com/prelude-so/java-sdk/issues/111)) ([52729f8](https://github.com/prelude-so/java-sdk/commit/52729f8dcdafec86c7aece8c69cdf0d2cbe7072d))


### Performance Improvements

* **client:** cached parsed type in `HttpResponseFor` ([#126](https://github.com/prelude-so/java-sdk/issues/126)) ([71b79be](https://github.com/prelude-so/java-sdk/commit/71b79be5964ff1f8c1cd041367822286cf4af5d2))


### Chores

* **client:** refactor exception structure and methods ([#113](https://github.com/prelude-so/java-sdk/issues/113)) ([76182b5](https://github.com/prelude-so/java-sdk/commit/76182b528d3296e1ce46856fe25c6875087d0c85))
* **client:** remove unnecessary json state from some query param classes ([f505739](https://github.com/prelude-so/java-sdk/commit/f505739e95f15b012fc4f6e7c461a38749f36039))
* **internal:** add generated comment ([#107](https://github.com/prelude-so/java-sdk/issues/107)) ([4ca9321](https://github.com/prelude-so/java-sdk/commit/4ca93214191c99076efde95a1d6999d2286d3fad))
* **internal:** add invalid json deserialization tests ([f505739](https://github.com/prelude-so/java-sdk/commit/f505739e95f15b012fc4f6e7c461a38749f36039))
* **internal:** add json roundtripping tests ([f505739](https://github.com/prelude-so/java-sdk/commit/f505739e95f15b012fc4f6e7c461a38749f36039))
* **internal:** add missing release please block ([#112](https://github.com/prelude-so/java-sdk/issues/112)) ([219bd86](https://github.com/prelude-so/java-sdk/commit/219bd86d08767c3af1f0fb05cb9f0d111f65a670))
* **internal:** codegen related update ([#124](https://github.com/prelude-so/java-sdk/issues/124)) ([122cda2](https://github.com/prelude-so/java-sdk/commit/122cda23e464cb431cefaca5ccf86da9bda94829))
* **internal:** delete duplicate tests ([fdf9cd4](https://github.com/prelude-so/java-sdk/commit/fdf9cd4b5afeeeda86f39a4d091fc569050f7030))
* **internal:** delete unused methods and annotations ([#120](https://github.com/prelude-so/java-sdk/issues/120)) ([fba5a3d](https://github.com/prelude-so/java-sdk/commit/fba5a3d8184321e2f18ef24fe2c3e276094a10ab))
* **internal:** expand CI branch coverage ([#132](https://github.com/prelude-so/java-sdk/issues/132)) ([befddbb](https://github.com/prelude-so/java-sdk/commit/befddbb489be2d34c04c7c451f1f1f8e04341757))
* **internal:** fix example formatting ([#115](https://github.com/prelude-so/java-sdk/issues/115)) ([0f67401](https://github.com/prelude-so/java-sdk/commit/0f674019ad21c96b191dfa66df3bf191fa92a5ba))
* **internal:** generate more tests ([073a416](https://github.com/prelude-so/java-sdk/commit/073a41651b208b825534910564695d36e5c0738e))
* **internal:** make multipart assertions more robust ([20a5e00](https://github.com/prelude-so/java-sdk/commit/20a5e00a69b82f0f97ac05d12cd592042411ecec))
* **internal:** make test classes internal ([#106](https://github.com/prelude-so/java-sdk/issues/106)) ([271fcb9](https://github.com/prelude-so/java-sdk/commit/271fcb922b2ebae6b39a538cc8b034905525a6c3))
* **internal:** reduce CI branch coverage ([9e9afa4](https://github.com/prelude-so/java-sdk/commit/9e9afa4c02ddd86e8f38eb6d1aa65d6c526ab8f7))
* **internal:** refactor some test assertions ([fdf9cd4](https://github.com/prelude-so/java-sdk/commit/fdf9cd4b5afeeeda86f39a4d091fc569050f7030))
* **internal:** reformat some tests ([#110](https://github.com/prelude-so/java-sdk/issues/110)) ([073a416](https://github.com/prelude-so/java-sdk/commit/073a41651b208b825534910564695d36e5c0738e))
* **internal:** remove extra empty newlines ([#104](https://github.com/prelude-so/java-sdk/issues/104)) ([2234162](https://github.com/prelude-so/java-sdk/commit/2234162dc6e6cc224f0489fa41b0987eade2145d))
* **internal:** remove unnecessary `assertNotNull` calls ([20a5e00](https://github.com/prelude-so/java-sdk/commit/20a5e00a69b82f0f97ac05d12cd592042411ecec))
* **internal:** remove unnecessary import ([#116](https://github.com/prelude-so/java-sdk/issues/116)) ([3ae122d](https://github.com/prelude-so/java-sdk/commit/3ae122dfe7c4695706d4d9f79f3305429825422c))
* **internal:** rename `getPathParam` ([#109](https://github.com/prelude-so/java-sdk/issues/109)) ([fdf9cd4](https://github.com/prelude-so/java-sdk/commit/fdf9cd4b5afeeeda86f39a4d091fc569050f7030))
* **internal:** reorder some params methodsc ([fdf9cd4](https://github.com/prelude-so/java-sdk/commit/fdf9cd4b5afeeeda86f39a4d091fc569050f7030))
* **internal:** swap from `getNullable` to `getOptional` ([#127](https://github.com/prelude-so/java-sdk/issues/127)) ([525f57d](https://github.com/prelude-so/java-sdk/commit/525f57ddc6fa35537981c4f761f869a75e20e14b))
* **internal:** version bump ([#102](https://github.com/prelude-so/java-sdk/issues/102)) ([a8c29dd](https://github.com/prelude-so/java-sdk/commit/a8c29dd890a12fb927932bc67a0a827262bc18fa))
* rerun ci ([16e1797](https://github.com/prelude-so/java-sdk/commit/16e17976d387aa7d478d71cded50b795784264c7))
* **tests:** improve enum examples ([#130](https://github.com/prelude-so/java-sdk/issues/130)) ([008765e](https://github.com/prelude-so/java-sdk/commit/008765ee9692147083588ee7d43aae822c1c4434))


### Documentation

* add `build` method comments ([#108](https://github.com/prelude-so/java-sdk/issues/108)) ([bafd4ba](https://github.com/prelude-so/java-sdk/commit/bafd4ba207878071b2d32769785993bcfb8b2375))
* add comments to `JsonField` classes ([4d0542f](https://github.com/prelude-so/java-sdk/commit/4d0542f0658afbd81edfc0d99dbc748ded112489))
* deduplicate and refine comments ([#105](https://github.com/prelude-so/java-sdk/issues/105)) ([081b27a](https://github.com/prelude-so/java-sdk/commit/081b27aeaa2c06a3ba088fcc5f8476bda4e1fde9))
* document how to forcibly omit required field ([c98bfc6](https://github.com/prelude-so/java-sdk/commit/c98bfc6bd43b3c9387913b694f74793bc9e9d9e2))
* minor readme tweak ([#118](https://github.com/prelude-so/java-sdk/issues/118)) ([e860b24](https://github.com/prelude-so/java-sdk/commit/e860b244e1d132077638e6b08ea91728636fca98))
* refine comments on multipart params ([#114](https://github.com/prelude-so/java-sdk/issues/114)) ([20a5e00](https://github.com/prelude-so/java-sdk/commit/20a5e00a69b82f0f97ac05d12cd592042411ecec))
* swap examples used in readme ([#129](https://github.com/prelude-so/java-sdk/issues/129)) ([c98bfc6](https://github.com/prelude-so/java-sdk/commit/c98bfc6bd43b3c9387913b694f74793bc9e9d9e2))
* update readme exception docs ([#117](https://github.com/prelude-so/java-sdk/issues/117)) ([9741cea](https://github.com/prelude-so/java-sdk/commit/9741ceaf73c4f77e10410e94c776ca2748df264e))

## 0.2.0 (2025-03-11)

Full Changelog: [v0.1.0...v0.2.0](https://github.com/prelude-so/java-sdk/compare/v0.1.0...v0.2.0)

### ⚠ BREAKING CHANGES

* **client:** refactor multipart formdata impl ([#88](https://github.com/prelude-so/java-sdk/issues/88))

### Features

* **api:** update via SDK Studio ([#101](https://github.com/prelude-so/java-sdk/issues/101)) ([6a11555](https://github.com/prelude-so/java-sdk/commit/6a115553391fa5d508591a0e7d9276c77932d655))
* **client:** accept `InputStream` and `Path` for file params ([#91](https://github.com/prelude-so/java-sdk/issues/91)) ([8eda1f9](https://github.com/prelude-so/java-sdk/commit/8eda1f91475a85323fa68dc005691ca4c682c11e))
* **client:** allow configuring timeouts granularly ([#86](https://github.com/prelude-so/java-sdk/issues/86)) ([c95dda7](https://github.com/prelude-so/java-sdk/commit/c95dda7f3695cb7e8d2fd9492dbe076a493af577))
* **client:** detect binary incompatible jackson versions ([#92](https://github.com/prelude-so/java-sdk/issues/92)) ([70eeac5](https://github.com/prelude-so/java-sdk/commit/70eeac547295b468afe457d18a93e587dd185a42))
* **client:** get rid of annoying checked exceptions ([#74](https://github.com/prelude-so/java-sdk/issues/74)) ([126e59c](https://github.com/prelude-so/java-sdk/commit/126e59cd41cb1e3f8694aba1014d7150dee0d3ef))
* **client:** send client-side timeout headers ([#64](https://github.com/prelude-so/java-sdk/issues/64)) ([0004d4b](https://github.com/prelude-so/java-sdk/commit/0004d4b736fcd0a9e5852064bb67de8bea7085d9))
* **client:** support `JsonField#asX()` for known values ([#70](https://github.com/prelude-so/java-sdk/issues/70)) ([1177107](https://github.com/prelude-so/java-sdk/commit/1177107207b6f38e332e90586d9ce8246526b52f))
* **client:** support raw response access ([#87](https://github.com/prelude-so/java-sdk/issues/87)) ([b9e1582](https://github.com/prelude-so/java-sdk/commit/b9e1582f150e8507b407e85c923199f91b2c902b))
* **client:** update enum `asX` methods ([#69](https://github.com/prelude-so/java-sdk/issues/69)) ([54b7bbb](https://github.com/prelude-so/java-sdk/commit/54b7bbb6d371578165988f2029672106a88420d6))
* generate and publish docs ([#93](https://github.com/prelude-so/java-sdk/issues/93)) ([f84c7ad](https://github.com/prelude-so/java-sdk/commit/f84c7adef71ba10d0e4ff2207831d53a234b5e26))


### Bug Fixes

* **api:** add missing `@MustBeClosed` annotations ([#65](https://github.com/prelude-so/java-sdk/issues/65)) ([84f3ed5](https://github.com/prelude-so/java-sdk/commit/84f3ed53e37423b70ebbeeca553057dbe74a2d6c))
* **api:** switch `CompletableFuture&lt;Void&gt;` to `CompletableFuture<Void?>` ([84f3ed5](https://github.com/prelude-so/java-sdk/commit/84f3ed53e37423b70ebbeeca553057dbe74a2d6c))
* **client:** add missing validation calls on response ([84f3ed5](https://github.com/prelude-so/java-sdk/commit/84f3ed53e37423b70ebbeeca553057dbe74a2d6c))
* **client:** always provide a body for `PATCH` methods ([84f3ed5](https://github.com/prelude-so/java-sdk/commit/84f3ed53e37423b70ebbeeca553057dbe74a2d6c))
* **client:** mark some request bodies as optional ([#76](https://github.com/prelude-so/java-sdk/issues/76)) ([33fbc22](https://github.com/prelude-so/java-sdk/commit/33fbc22a1ece9371bafb0fef3094e1e58a233998))


### Chores

* **ci:** update gradle actions to v4 ([#73](https://github.com/prelude-so/java-sdk/issues/73)) ([a7796a6](https://github.com/prelude-so/java-sdk/commit/a7796a6e65606082d82db23ec2b12b180b94eafe))
* **client:** refactor multipart formdata impl ([#88](https://github.com/prelude-so/java-sdk/issues/88)) ([c337e94](https://github.com/prelude-so/java-sdk/commit/c337e942bb959c2510239b04bc7e8e72dd0d9e6b))
* **client:** use deep identity methods for primitive array types ([#82](https://github.com/prelude-so/java-sdk/issues/82)) ([2bf8585](https://github.com/prelude-so/java-sdk/commit/2bf8585c4e47152e7e5619faddbec5ab91be8cd4))
* **docs:** add faq to readme ([#75](https://github.com/prelude-so/java-sdk/issues/75)) ([fa8588c](https://github.com/prelude-so/java-sdk/commit/fa8588cf8f7b3b2048866fef4b620dadb12b60ff))
* **docs:** reorganize readme ([#71](https://github.com/prelude-so/java-sdk/issues/71)) ([bf2649a](https://github.com/prelude-so/java-sdk/commit/bf2649a748083a0ffffa6214c5e99854f6f96090))
* **internal:** add `.kotlin` to `.gitignore` ([#94](https://github.com/prelude-so/java-sdk/issues/94)) ([d4046f8](https://github.com/prelude-so/java-sdk/commit/d4046f8b55eaf6235d3efb4c62e979a7fd045009))
* **internal:** add async service tests ([#80](https://github.com/prelude-so/java-sdk/issues/80)) ([b8162d7](https://github.com/prelude-so/java-sdk/commit/b8162d78b2ee25b6c29f7472710533cae2937bf7))
* **internal:** codegen related update ([#100](https://github.com/prelude-so/java-sdk/issues/100)) ([8dd7c60](https://github.com/prelude-so/java-sdk/commit/8dd7c60966a7a89915314f82ca7a978b0b1e60b7))
* **internal:** codegen related update ([#61](https://github.com/prelude-so/java-sdk/issues/61)) ([20ea6d4](https://github.com/prelude-so/java-sdk/commit/20ea6d4d3000c46b6508c9049227c3121a9e81d1))
* **internal:** codegen related update ([#79](https://github.com/prelude-so/java-sdk/issues/79)) ([132c8a7](https://github.com/prelude-so/java-sdk/commit/132c8a7f3b2045f8ab5886887b303e0e550ca231))
* **internal:** codegen related update ([#81](https://github.com/prelude-so/java-sdk/issues/81)) ([4d0680b](https://github.com/prelude-so/java-sdk/commit/4d0680b16a64f3bcb311232e30253f71a8950735))
* **internal:** codegen related update ([#99](https://github.com/prelude-so/java-sdk/issues/99)) ([9798698](https://github.com/prelude-so/java-sdk/commit/9798698fbbc39b62eaa9ae5e01aa82ca35de6f04))
* **internal:** don't use `JvmOverloads` in interfaces ([8ecb616](https://github.com/prelude-so/java-sdk/commit/8ecb6164cccf4abebea2f329ad632d4c5ac1efc2))
* **internal:** get rid of configuration cache ([#72](https://github.com/prelude-so/java-sdk/issues/72)) ([911d28f](https://github.com/prelude-so/java-sdk/commit/911d28f2e1d51d0d0612eddfdabd9ab498a04e01))
* **internal:** improve sync service tests ([b8162d7](https://github.com/prelude-so/java-sdk/commit/b8162d78b2ee25b6c29f7472710533cae2937bf7))
* **internal:** make body class constructors private ([234f5ac](https://github.com/prelude-so/java-sdk/commit/234f5ac1ab3d01d65839ec18c941c7dc0e70052a))
* **internal:** make body classes for multipart requests ([234f5ac](https://github.com/prelude-so/java-sdk/commit/234f5ac1ab3d01d65839ec18c941c7dc0e70052a))
* **internal:** minor formatting/style changes ([84f3ed5](https://github.com/prelude-so/java-sdk/commit/84f3ed53e37423b70ebbeeca553057dbe74a2d6c))
* **internal:** misc formatting changes ([234f5ac](https://github.com/prelude-so/java-sdk/commit/234f5ac1ab3d01d65839ec18c941c7dc0e70052a))
* **internal:** optimize build and test perf ([3c59ced](https://github.com/prelude-so/java-sdk/commit/3c59ced9372768d32e5d99982373f6c656707ea0))
* **internal:** reenable warnings as errors ([#96](https://github.com/prelude-so/java-sdk/issues/96)) ([8ecb616](https://github.com/prelude-so/java-sdk/commit/8ecb6164cccf4abebea2f329ad632d4c5ac1efc2))
* **internal:** refactor `ErrorHandlingTest` ([#85](https://github.com/prelude-so/java-sdk/issues/85)) ([c80755d](https://github.com/prelude-so/java-sdk/commit/c80755d622326574f9d147b2e1d7ec4c25587240))
* **internal:** refactor `PhantomReachableClosingAsyncStreamResponse` impl ([#66](https://github.com/prelude-so/java-sdk/issues/66)) ([a9c5a51](https://github.com/prelude-so/java-sdk/commit/a9c5a519d6cb4d93f50b2a19b71609686a2b6b5d))
* **internal:** refactor `ServiceParamsTest` ([#83](https://github.com/prelude-so/java-sdk/issues/83)) ([796a896](https://github.com/prelude-so/java-sdk/commit/796a8960e23b404f26841fbc603d8c8c73b60f0d))
* **internal:** remove unnecessary non-null asserts in tests ([33fbc22](https://github.com/prelude-so/java-sdk/commit/33fbc22a1ece9371bafb0fef3094e1e58a233998))
* **internal:** rename internal body classes ([234f5ac](https://github.com/prelude-so/java-sdk/commit/234f5ac1ab3d01d65839ec18c941c7dc0e70052a))
* **internal:** rename some tests ([84f3ed5](https://github.com/prelude-so/java-sdk/commit/84f3ed53e37423b70ebbeeca553057dbe74a2d6c))
* **internal:** update formatter ([#67](https://github.com/prelude-so/java-sdk/issues/67)) ([3c59ced](https://github.com/prelude-so/java-sdk/commit/3c59ced9372768d32e5d99982373f6c656707ea0))
* **internal:** update some formatting in `Values.kt` ([1177107](https://github.com/prelude-so/java-sdk/commit/1177107207b6f38e332e90586d9ce8246526b52f))
* **internal:** use `assertNotNull` in tests for type narrowing ([33fbc22](https://github.com/prelude-so/java-sdk/commit/33fbc22a1ece9371bafb0fef3094e1e58a233998))
* **internal:** use `getOrNull` instead of `orElse(null)` ([#95](https://github.com/prelude-so/java-sdk/issues/95)) ([263fca9](https://github.com/prelude-so/java-sdk/commit/263fca955019de4d230b2350ed350e966ad67b60))
* **internal:** use better test example values ([#68](https://github.com/prelude-so/java-sdk/issues/68)) ([234f5ac](https://github.com/prelude-so/java-sdk/commit/234f5ac1ab3d01d65839ec18c941c7dc0e70052a))


### Documentation

* add immutability explanation to readme ([#77](https://github.com/prelude-so/java-sdk/issues/77)) ([9288a36](https://github.com/prelude-so/java-sdk/commit/9288a36ccd6d7a9439c0770306afae7cd9f846dd))
* add more phantom reachability docs ([a9c5a51](https://github.com/prelude-so/java-sdk/commit/a9c5a519d6cb4d93f50b2a19b71609686a2b6b5d))
* add raw response readme documentation ([#89](https://github.com/prelude-so/java-sdk/issues/89)) ([e7452c0](https://github.com/prelude-so/java-sdk/commit/e7452c0e6d8bf53b3aeba2eda47b0e37261a1c13))
* add source file links to readme ([#78](https://github.com/prelude-so/java-sdk/issues/78)) ([93b0357](https://github.com/prelude-so/java-sdk/commit/93b0357e89f1026a7ec92e7dd3f41fe5d068dba5))
* document `JsonValue` construction in readme ([#98](https://github.com/prelude-so/java-sdk/issues/98)) ([9741ba8](https://github.com/prelude-so/java-sdk/commit/9741ba895a06e783f2b2aba20d0ba73e13087f12))
* fix incorrect additional properties info ([#63](https://github.com/prelude-so/java-sdk/issues/63)) ([51310ff](https://github.com/prelude-so/java-sdk/commit/51310ff3fb72ba4d132da89583a0649fde298b1d))
* note required fields in `builder` javadoc ([#90](https://github.com/prelude-so/java-sdk/issues/90)) ([1e9b10f](https://github.com/prelude-so/java-sdk/commit/1e9b10f2ef48b35b652e0196a3b617e50a4afda2))
* readme parameter tweaks ([b8162d7](https://github.com/prelude-so/java-sdk/commit/b8162d78b2ee25b6c29f7472710533cae2937bf7))
* revise readme docs about nested params ([#97](https://github.com/prelude-so/java-sdk/issues/97)) ([d1ec762](https://github.com/prelude-so/java-sdk/commit/d1ec762446c9c249c07d12ae34c7996d982eac53))
* update URLs from stainlessapi.com to stainless.com ([#84](https://github.com/prelude-so/java-sdk/issues/84)) ([524b3a3](https://github.com/prelude-so/java-sdk/commit/524b3a345ab7120a792243765faf4bbfedcdd63e))

## 0.1.0 (2025-02-05)

Full Changelog: [v0.1.0-beta.3...v0.1.0](https://github.com/prelude-so/java-sdk/compare/v0.1.0-beta.3...v0.1.0)

### Features

* **api:** update via SDK Studio ([#59](https://github.com/prelude-so/java-sdk/issues/59)) ([fc804e7](https://github.com/prelude-so/java-sdk/commit/fc804e7de92e09f52ec65d62037d8d0563c096d7))
* **client:** add `close` method ([#54](https://github.com/prelude-so/java-sdk/issues/54)) ([91ac2e0](https://github.com/prelude-so/java-sdk/commit/91ac2e04eba1d7683ec4e302602e6367c33fe3e3))


### Bug Fixes

* **client:** make service impl constructors internal ([#49](https://github.com/prelude-so/java-sdk/issues/49)) ([1ff9060](https://github.com/prelude-so/java-sdk/commit/1ff906090901691aa3ccdf3206b74c740a30a475))
* **client:** make some classes and constructors non-public ([#57](https://github.com/prelude-so/java-sdk/issues/57)) ([2ebc3ce](https://github.com/prelude-so/java-sdk/commit/2ebc3ce52f68fb30c10a2a99d9276b9381852498))


### Chores

* add max retries to test ([#53](https://github.com/prelude-so/java-sdk/issues/53)) ([d75447a](https://github.com/prelude-so/java-sdk/commit/d75447ad34098bdc4696b46a6f16cdc43424f995))
* **internal:** add and tweak check functions ([#44](https://github.com/prelude-so/java-sdk/issues/44)) ([8b8c645](https://github.com/prelude-so/java-sdk/commit/8b8c645ce1ba7e9184a40bf56fd3d29959d38194))
* **internal:** codegen related update ([#46](https://github.com/prelude-so/java-sdk/issues/46)) ([62069a1](https://github.com/prelude-so/java-sdk/commit/62069a1fd1b797908a7b0a380633092780e2e6ea))
* **internal:** remove some unnecessary `constructor` keywords ([2ebc3ce](https://github.com/prelude-so/java-sdk/commit/2ebc3ce52f68fb30c10a2a99d9276b9381852498))
* **internal:** swap `checkNotNull` to `checkRequired` ([#52](https://github.com/prelude-so/java-sdk/issues/52)) ([42cb5fb](https://github.com/prelude-so/java-sdk/commit/42cb5fb553a97f3fabb51dacce32629ed1cbc7a5))
* **internal:** tweak client options nullability handling ([8b8c645](https://github.com/prelude-so/java-sdk/commit/8b8c645ce1ba7e9184a40bf56fd3d29959d38194))
* **internal:** upgrade kotlin compiler and gradle ([#47](https://github.com/prelude-so/java-sdk/issues/47)) ([9537420](https://github.com/prelude-so/java-sdk/commit/9537420b594007dacf13d3bcba31fa3cd3567ed1))


### Documentation

* `async` and `sync` method comments ([#56](https://github.com/prelude-so/java-sdk/issues/56)) ([7c195c7](https://github.com/prelude-so/java-sdk/commit/7c195c7f06342c3f159d40ba4be0e31e08970a85))
* add client documentation ([#55](https://github.com/prelude-so/java-sdk/issues/55)) ([084e901](https://github.com/prelude-so/java-sdk/commit/084e901a083bb4023991cc40d1b39bcf4921499a))
* add more documentation ([#48](https://github.com/prelude-so/java-sdk/issues/48)) ([5d4606c](https://github.com/prelude-so/java-sdk/commit/5d4606c7a180be5fb11d563d2ee69f4f3ff297ea))
* builder, enum, and union comments ([#58](https://github.com/prelude-so/java-sdk/issues/58)) ([907f20f](https://github.com/prelude-so/java-sdk/commit/907f20fa13c68b0e44292e258f9c5efde7efd63a))
* move up requirements section ([#51](https://github.com/prelude-so/java-sdk/issues/51)) ([4c3193d](https://github.com/prelude-so/java-sdk/commit/4c3193d709422f7baf8b39f281b4e36e5d1496f0))
* update readme ([#50](https://github.com/prelude-so/java-sdk/issues/50)) ([17a2c9a](https://github.com/prelude-so/java-sdk/commit/17a2c9a7a8f7acd08e965ded0c3d0c56ba9f9964))

## 0.1.0-beta.3 (2025-01-14)

Full Changelog: [v0.1.0-beta.2...v0.1.0-beta.3](https://github.com/prelude-so/java-sdk/compare/v0.1.0-beta.2...v0.1.0-beta.3)

### Chores

* remove custom code ([cfb03ee](https://github.com/prelude-so/java-sdk/commit/cfb03ee0d9af070198b799b6d8731f4f878140be))

## 0.1.0-beta.2 (2025-01-14)

Full Changelog: [v0.1.0-beta.1...v0.1.0-beta.2](https://github.com/prelude-so/java-sdk/compare/v0.1.0-beta.1...v0.1.0-beta.2)

### Features

* **api:** update via SDK Studio ([#35](https://github.com/prelude-so/java-sdk/issues/35)) ([39dec67](https://github.com/prelude-so/java-sdk/commit/39dec6749e388caf45ff11db92f873c38be1f155))


### Chores

* **internal:** version bump ([#37](https://github.com/prelude-so/java-sdk/issues/37)) ([aea3644](https://github.com/prelude-so/java-sdk/commit/aea3644e4d34ff0fc541fdafa1cc5150413210d0))

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
