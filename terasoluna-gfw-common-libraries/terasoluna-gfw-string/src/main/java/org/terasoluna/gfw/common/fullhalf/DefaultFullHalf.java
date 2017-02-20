/*
 * Copyright (C) 2013-2017 NTT DATA Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.terasoluna.gfw.common.fullhalf;

/**
 * Convenient class holding an instance of {@link FullHalfConverter} with default mapping table. Default mapping rule is as
 * follows:
 * <table border=1>
 * <caption>default mapping table</caption>
 * <tr>
 * <th>Fullwidth</th>
 * <th>Halfwidth</th>
 * </tr>
 * <tr>
 * <td>！</td>
 * <td>!</td>
 * </tr>
 * <tr>
 * <td>”</td>
 * <td>"</td>
 * </tr>
 * <tr>
 * <td>＃</td>
 * <td>#</td>
 * </tr>
 * <tr>
 * <td>＄</td>
 * <td>$</td>
 * </tr>
 * <tr>
 * <td>％</td>
 * <td>%</td>
 * </tr>
 * <tr>
 * <td>＆</td>
 * <td>&amp;</td>
 * </tr>
 * <tr>
 * <td>’</td>
 * <td>'</td>
 * </tr>
 * <tr>
 * <td>（</td>
 * <td>(</td>
 * </tr>
 * <tr>
 * <td>）</td>
 * <td>)</td>
 * </tr>
 * <tr>
 * <td>＊</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>＋</td>
 * <td>+</td>
 * </tr>
 * <tr>
 * <td>，</td>
 * <td>,</td>
 * </tr>
 * <tr>
 * <td>－</td>
 * <td>-</td>
 * </tr>
 * <tr>
 * <td>．</td>
 * <td>.</td>
 * </tr>
 * <tr>
 * <td>／</td>
 * <td>/</td>
 * </tr>
 * <tr>
 * <td>０</td>
 * <td>0</td>
 * </tr>
 * <tr>
 * <td>１</td>
 * <td>1</td>
 * </tr>
 * <tr>
 * <td>２</td>
 * <td>2</td>
 * </tr>
 * <tr>
 * <td>３</td>
 * <td>3</td>
 * </tr>
 * <tr>
 * <td>４</td>
 * <td>4</td>
 * </tr>
 * <tr>
 * <td>５</td>
 * <td>5</td>
 * </tr>
 * <tr>
 * <td>６</td>
 * <td>6</td>
 * </tr>
 * <tr>
 * <td>７</td>
 * <td>7</td>
 * </tr>
 * <tr>
 * <td>８</td>
 * <td>8</td>
 * </tr>
 * <tr>
 * <td>９</td>
 * <td>9</td>
 * </tr>
 * <tr>
 * <td>：</td>
 * <td>:</td>
 * </tr>
 * <tr>
 * <td>；</td>
 * <td>;</td>
 * </tr>
 * <tr>
 * <td>＜</td>
 * <td>&lt;</td>
 * </tr>
 * <tr>
 * <td>＝</td>
 * <td>=</td>
 * </tr>
 * <tr>
 * <td>＞</td>
 * <td>&gt;</td>
 * </tr>
 * <tr>
 * <td>？</td>
 * <td>?</td>
 * </tr>
 * <tr>
 * <td>＠</td>
 * <td>@</td>
 * </tr>
 * <tr>
 * <td>Ａ</td>
 * <td>A</td>
 * </tr>
 * <tr>
 * <td>Ｂ</td>
 * <td>B</td>
 * </tr>
 * <tr>
 * <td>Ｃ</td>
 * <td>C</td>
 * </tr>
 * <tr>
 * <td>Ｄ</td>
 * <td>D</td>
 * </tr>
 * <tr>
 * <td>Ｅ</td>
 * <td>E</td>
 * </tr>
 * <tr>
 * <td>Ｆ</td>
 * <td>F</td>
 * </tr>
 * <tr>
 * <td>Ｇ</td>
 * <td>G</td>
 * </tr>
 * <tr>
 * <td>Ｈ</td>
 * <td>H</td>
 * </tr>
 * <tr>
 * <td>Ｉ</td>
 * <td>I</td>
 * </tr>
 * <tr>
 * <td>Ｊ</td>
 * <td>J</td>
 * </tr>
 * <tr>
 * <td>Ｋ</td>
 * <td>K</td>
 * </tr>
 * <tr>
 * <td>Ｌ</td>
 * <td>L</td>
 * </tr>
 * <tr>
 * <td>Ｍ</td>
 * <td>M</td>
 * </tr>
 * <tr>
 * <td>Ｎ</td>
 * <td>N</td>
 * </tr>
 * <tr>
 * <td>Ｏ</td>
 * <td>O</td>
 * </tr>
 * <tr>
 * <td>Ｐ</td>
 * <td>P</td>
 * </tr>
 * <tr>
 * <td>Ｑ</td>
 * <td>Q</td>
 * </tr>
 * <tr>
 * <td>Ｒ</td>
 * <td>R</td>
 * </tr>
 * <tr>
 * <td>Ｓ</td>
 * <td>S</td>
 * </tr>
 * <tr>
 * <td>Ｔ</td>
 * <td>T</td>
 * </tr>
 * <tr>
 * <td>Ｕ</td>
 * <td>U</td>
 * </tr>
 * <tr>
 * <td>Ｖ</td>
 * <td>V</td>
 * </tr>
 * <tr>
 * <td>Ｗ</td>
 * <td>W</td>
 * </tr>
 * <tr>
 * <td>Ｘ</td>
 * <td>X</td>
 * </tr>
 * <tr>
 * <td>Ｙ</td>
 * <td>Y</td>
 * </tr>
 * <tr>
 * <td>Ｚ</td>
 * <td>Z</td>
 * </tr>
 * <tr>
 * <td>［</td>
 * <td>[</td>
 * </tr>
 * <tr>
 * <td>￥</td>
 * <td>\\</td>
 * </tr>
 * <tr>
 * <td>］</td>
 * <td>]</td>
 * </tr>
 * <tr>
 * <td>＾</td>
 * <td>^</td>
 * </tr>
 * <tr>
 * <td>＿</td>
 * <td>_</td>
 * </tr>
 * <tr>
 * <td>｀</td>
 * <td>`</td>
 * </tr>
 * <tr>
 * <td>ａ</td>
 * <td>a</td>
 * </tr>
 * <tr>
 * <td>ｂ</td>
 * <td>b</td>
 * </tr>
 * <tr>
 * <td>ｃ</td>
 * <td>c</td>
 * </tr>
 * <tr>
 * <td>ｄ</td>
 * <td>d</td>
 * </tr>
 * <tr>
 * <td>ｅ</td>
 * <td>e</td>
 * </tr>
 * <tr>
 * <td>ｆ</td>
 * <td>f</td>
 * </tr>
 * <tr>
 * <td>ｇ</td>
 * <td>g</td>
 * </tr>
 * <tr>
 * <td>ｈ</td>
 * <td>h</td>
 * </tr>
 * <tr>
 * <td>ｉ</td>
 * <td>i</td>
 * </tr>
 * <tr>
 * <td>ｊ</td>
 * <td>j</td>
 * </tr>
 * <tr>
 * <td>ｋ</td>
 * <td>k</td>
 * </tr>
 * <tr>
 * <td>ｌ</td>
 * <td>l</td>
 * </tr>
 * <tr>
 * <td>ｍ</td>
 * <td>m</td>
 * </tr>
 * <tr>
 * <td>ｎ</td>
 * <td>n</td>
 * </tr>
 * <tr>
 * <td>ｏ</td>
 * <td>o</td>
 * </tr>
 * <tr>
 * <td>ｐ</td>
 * <td>p</td>
 * </tr>
 * <tr>
 * <td>ｑ</td>
 * <td>q</td>
 * </tr>
 * <tr>
 * <td>ｒ</td>
 * <td>r</td>
 * </tr>
 * <tr>
 * <td>ｓ</td>
 * <td>s</td>
 * </tr>
 * <tr>
 * <td>ｔ</td>
 * <td>t</td>
 * </tr>
 * <tr>
 * <td>ｕ</td>
 * <td>u</td>
 * </tr>
 * <tr>
 * <td>ｖ</td>
 * <td>v</td>
 * </tr>
 * <tr>
 * <td>ｗ</td>
 * <td>w</td>
 * </tr>
 * <tr>
 * <td>ｘ</td>
 * <td>x</td>
 * </tr>
 * <tr>
 * <td>ｙ</td>
 * <td>y</td>
 * </tr>
 * <tr>
 * <td>ｚ</td>
 * <td>z</td>
 * </tr>
 * <tr>
 * <td>｛</td>
 * <td>{</td>
 * </tr>
 * <tr>
 * <td>｜</td>
 * <td>|</td>
 * </tr>
 * <tr>
 * <td>｝</td>
 * <td></td>
 * </tr>
 * <tr>
 * <td>～(\uff5e)</td>
 * <td>~</td>
 * </tr>
 * <tr>
 * <td>。</td>
 * <td>｡</td>
 * </tr>
 * <tr>
 * <td>「</td>
 * <td>｢</td>
 * </tr>
 * <tr>
 * <td>」</td>
 * <td>｣</td>
 * </tr>
 * <tr>
 * <td>、</td>
 * <td>､</td>
 * </tr>
 * <tr>
 * <td>・</td>
 * <td>･</td>
 * </tr>
 * <tr>
 * <td>ァ</td>
 * <td>ｧ</td>
 * </tr>
 * <tr>
 * <td>ィ</td>
 * <td>ｨ</td>
 * </tr>
 * <tr>
 * <td>ゥ</td>
 * <td>ｩ</td>
 * </tr>
 * <tr>
 * <td>ェ</td>
 * <td>ｪ</td>
 * </tr>
 * <tr>
 * <td>ォ</td>
 * <td>ｫ</td>
 * </tr>
 * <tr>
 * <td>ャ</td>
 * <td>ｬ</td>
 * </tr>
 * <tr>
 * <td>ュ</td>
 * <td>ｭ</td>
 * </tr>
 * <tr>
 * <td>ョ</td>
 * <td>ｮ</td>
 * </tr>
 * <tr>
 * <td>ッ</td>
 * <td>ｯ</td>
 * </tr>
 * <tr>
 * <td>ー</td>
 * <td>ｰ</td>
 * </tr>
 * <tr>
 * <td>ア</td>
 * <td>ｱ</td>
 * </tr>
 * <tr>
 * <td>イ</td>
 * <td>ｲ</td>
 * </tr>
 * <tr>
 * <td>ウ</td>
 * <td>ｳ</td>
 * </tr>
 * <tr>
 * <td>エ</td>
 * <td>ｴ</td>
 * </tr>
 * <tr>
 * <td>オ</td>
 * <td>ｵ</td>
 * </tr>
 * <tr>
 * <td>カ</td>
 * <td>ｶ</td>
 * </tr>
 * <tr>
 * <td>キ</td>
 * <td>ｷ</td>
 * </tr>
 * <tr>
 * <td>ク</td>
 * <td>ｸ</td>
 * </tr>
 * <tr>
 * <td>ケ</td>
 * <td>ｹ</td>
 * </tr>
 * <tr>
 * <td>コ</td>
 * <td>ｺ</td>
 * </tr>
 * <tr>
 * <td>サ</td>
 * <td>ｻ</td>
 * </tr>
 * <tr>
 * <td>シ</td>
 * <td>ｼ</td>
 * </tr>
 * <tr>
 * <td>ス</td>
 * <td>ｽ</td>
 * </tr>
 * <tr>
 * <td>セ</td>
 * <td>ｾ</td>
 * </tr>
 * <tr>
 * <td>ソ</td>
 * <td>ｿ</td>
 * </tr>
 * <tr>
 * <td>タ</td>
 * <td>ﾀ</td>
 * </tr>
 * <tr>
 * <td>チ</td>
 * <td>ﾁ</td>
 * </tr>
 * <tr>
 * <td>ツ</td>
 * <td>ﾂ</td>
 * </tr>
 * <tr>
 * <td>テ</td>
 * <td>ﾃ</td>
 * </tr>
 * <tr>
 * <td>ト</td>
 * <td>ﾄ</td>
 * </tr>
 * <tr>
 * <td>ナ</td>
 * <td>ﾅ</td>
 * </tr>
 * <tr>
 * <td>ニ</td>
 * <td>ﾆ</td>
 * </tr>
 * <tr>
 * <td>ヌ</td>
 * <td>ﾇ</td>
 * </tr>
 * <tr>
 * <td>ネ</td>
 * <td>ﾈ</td>
 * </tr>
 * <tr>
 * <td>ノ</td>
 * <td>ﾉ</td>
 * </tr>
 * <tr>
 * <td>ハ</td>
 * <td>ﾊ</td>
 * </tr>
 * <tr>
 * <td>ヒ</td>
 * <td>ﾋ</td>
 * </tr>
 * <tr>
 * <td>フ</td>
 * <td>ﾌ</td>
 * </tr>
 * <tr>
 * <td>ヘ</td>
 * <td>ﾍ</td>
 * </tr>
 * <tr>
 * <td>ホ</td>
 * <td>ﾎ</td>
 * </tr>
 * <tr>
 * <td>マ</td>
 * <td>ﾏ</td>
 * </tr>
 * <tr>
 * <td>ミ</td>
 * <td>ﾐ</td>
 * </tr>
 * <tr>
 * <td>ム</td>
 * <td>ﾑ</td>
 * </tr>
 * <tr>
 * <td>メ</td>
 * <td>ﾒ</td>
 * </tr>
 * <tr>
 * <td>モ</td>
 * <td>ﾓ</td>
 * </tr>
 * <tr>
 * <td>ヤ</td>
 * <td>ﾔ</td>
 * </tr>
 * <tr>
 * <td>ユ</td>
 * <td>ﾕ</td>
 * </tr>
 * <tr>
 * <td>ヨ</td>
 * <td>ﾖ</td>
 * </tr>
 * <tr>
 * <td>ラ</td>
 * <td>ﾗ</td>
 * </tr>
 * <tr>
 * <td>リ</td>
 * <td>ﾘ</td>
 * </tr>
 * <tr>
 * <td>ル</td>
 * <td>ﾙ</td>
 * </tr>
 * <tr>
 * <td>レ</td>
 * <td>ﾚ</td>
 * </tr>
 * <tr>
 * <td>ロ</td>
 * <td>ﾛ</td>
 * </tr>
 * <tr>
 * <td>ワ</td>
 * <td>ﾜ</td>
 * </tr>
 * <tr>
 * <td>ヲ</td>
 * <td>ｦ</td>
 * </tr>
 * <tr>
 * <td>ン</td>
 * <td>ﾝ</td>
 * </tr>
 * <tr>
 * <td>ガ</td>
 * <td>ｶﾞ</td>
 * </tr>
 * <tr>
 * <td>ギ</td>
 * <td>ｷﾞ</td>
 * </tr>
 * <tr>
 * <td>グ</td>
 * <td>ｸﾞ</td>
 * </tr>
 * <tr>
 * <td>ゲ</td>
 * <td>ｹﾞ</td>
 * </tr>
 * <tr>
 * <td>ゴ</td>
 * <td>ｺﾞ</td>
 * </tr>
 * <tr>
 * <td>ザ</td>
 * <td>ｻﾞ</td>
 * </tr>
 * <tr>
 * <td>ジ</td>
 * <td>ｼﾞ</td>
 * </tr>
 * <tr>
 * <td>ズ</td>
 * <td>ｽﾞ</td>
 * </tr>
 * <tr>
 * <td>ゼ</td>
 * <td>ｾﾞ</td>
 * </tr>
 * <tr>
 * <td>ゾ</td>
 * <td>ｿﾞ</td>
 * </tr>
 * <tr>
 * <td>ダ</td>
 * <td>ﾀﾞ</td>
 * </tr>
 * <tr>
 * <td>ヂ</td>
 * <td>ﾁﾞ</td>
 * </tr>
 * <tr>
 * <td>ヅ</td>
 * <td>ﾂﾞ</td>
 * </tr>
 * <tr>
 * <td>デ</td>
 * <td>ﾃﾞ</td>
 * </tr>
 * <tr>
 * <td>ド</td>
 * <td>ﾄﾞ</td>
 * </tr>
 * <tr>
 * <td>バ</td>
 * <td>ﾊﾞ</td>
 * </tr>
 * <tr>
 * <td>ビ</td>
 * <td>ﾋﾞ</td>
 * </tr>
 * <tr>
 * <td>ブ</td>
 * <td>ﾌﾞ</td>
 * </tr>
 * <tr>
 * <td>べ</td>
 * <td>ﾍﾞ</td>
 * </tr>
 * <tr>
 * <td>ボ</td>
 * <td>ﾎﾞ</td>
 * </tr>
 * <tr>
 * <td>パ</td>
 * <td>ﾊﾟ</td>
 * </tr>
 * <tr>
 * <td>ピ</td>
 * <td>ﾋﾟ</td>
 * </tr>
 * <tr>
 * <td>プ</td>
 * <td>ﾌﾟ</td>
 * </tr>
 * <tr>
 * <td>ペ</td>
 * <td>ﾍﾟ</td>
 * </tr>
 * <tr>
 * <td>ポ</td>
 * <td>ﾎﾟ</td>
 * </tr>
 * <tr>
 * <td>ヴ</td>
 * <td>ｳﾞ</td>
 * </tr>
 * <tr>
 * <td>ヷ(\u30f7)</td>
 * <td>ﾜﾞ</td>
 * </tr>
 * <tr>
 * <td>ヺ(\u30fa)</td>
 * <td>ｦﾞ</td>
 * </tr>
 * <tr>
 * <td>゛</td>
 * <td>ﾞ</td>
 * </tr>
 * <tr>
 * <td>゜</td>
 * <td>ﾟ</td>
 * </tr>
 * <tr>
 * <td>　</td>
 * <td>&nbsp;</td>
 * </tr>
 * </table>
 * Note that this converter converts full-width string and half-width string each other as much as possible. This rule does not
 * matter JIS X 0201 nor JIS X 0208.
 * @since 5.1.0
 */
public final class DefaultFullHalf {

    /**
     * Default constructor
     */
    private DefaultFullHalf() {
        // do nothing for Default constructor
    }

    /**
     * a singleton instance with default mapping table.
     * @see DefaultFullHalf
     */
    public static final FullHalfConverter INSTANCE = new FullHalfConverter(new FullHalfPairsBuilder()
            .pair("！", "!").pair("”", "\"").pair("＃", "#").pair("＄", "$").pair(
                    "％", "%").pair("＆", "&").pair("’", "'").pair("（", "(")
            .pair("）", ")").pair("＊", "*").pair("＋", "+").pair("，", ",").pair(
                    "－", "-").pair("．", ".").pair("／", "/").pair("０", "0")
            .pair("１", "1").pair("２", "2").pair("３", "3").pair("４", "4").pair(
                    "５", "5").pair("６", "6").pair("７", "7").pair("８", "8")
            .pair("９", "9").pair("：", ":").pair("；", ";").pair("＜", "<").pair(
                    "＝", "=").pair("＞", ">").pair("？", "?").pair("＠", "@")
            .pair("Ａ", "A").pair("Ｂ", "B").pair("Ｃ", "C").pair("Ｄ", "D").pair(
                    "Ｅ", "E").pair("Ｆ", "F").pair("Ｇ", "G").pair("Ｈ", "H")
            .pair("Ｉ", "I").pair("Ｊ", "J").pair("Ｋ", "K").pair("Ｌ", "L").pair(
                    "Ｍ", "M").pair("Ｎ", "N").pair("Ｏ", "O").pair("Ｐ", "P")
            .pair("Ｑ", "Q").pair("Ｒ", "R").pair("Ｓ", "S").pair("Ｔ", "T").pair(
                    "Ｕ", "U").pair("Ｖ", "V").pair("Ｗ", "W").pair("Ｘ", "X")
            .pair("Ｙ", "Y").pair("Ｚ", "Z").pair("［", "[").pair("￥", "\\").pair(
                    "］", "]").pair("＾", "^").pair("＿", "_").pair("｀", "`")
            .pair("ａ", "a").pair("ｂ", "b").pair("ｃ", "c").pair("ｄ", "d").pair(
                    "ｅ", "e").pair("ｆ", "f").pair("ｇ", "g").pair("ｈ", "h")
            .pair("ｉ", "i").pair("ｊ", "j").pair("ｋ", "k").pair("ｌ", "l").pair(
                    "ｍ", "m").pair("ｎ", "n").pair("ｏ", "o").pair("ｐ", "p")
            .pair("ｑ", "q").pair("ｒ", "r").pair("ｓ", "s").pair("ｔ", "t").pair(
                    "ｕ", "u").pair("ｖ", "v").pair("ｗ", "w").pair("ｘ", "x")
            .pair("ｙ", "y").pair("ｚ", "z").pair("｛", "{").pair("｜", "|").pair(
                    "｝", "}").pair("\uff5e", "~").pair("。", "｡").pair("「", "｢")
            .pair("」", "｣").pair("、", "､").pair("・", "･").pair("ァ", "ｧ").pair(
                    "ィ", "ｨ").pair("ゥ", "ｩ").pair("ェ", "ｪ").pair("ォ", "ｫ")
            .pair("ャ", "ｬ").pair("ュ", "ｭ").pair("ョ", "ｮ").pair("ッ", "ｯ").pair(
                    "ー", "ｰ").pair("ア", "ｱ").pair("イ", "ｲ").pair("ウ", "ｳ")
            .pair("エ", "ｴ").pair("オ", "ｵ").pair("カ", "ｶ").pair("キ", "ｷ").pair(
                    "ク", "ｸ").pair("ケ", "ｹ").pair("コ", "ｺ").pair("サ", "ｻ")
            .pair("シ", "ｼ").pair("ス", "ｽ").pair("セ", "ｾ").pair("ソ", "ｿ").pair(
                    "タ", "ﾀ").pair("チ", "ﾁ").pair("ツ", "ﾂ").pair("テ", "ﾃ")
            .pair("ト", "ﾄ").pair("ナ", "ﾅ").pair("ニ", "ﾆ").pair("ヌ", "ﾇ").pair(
                    "ネ", "ﾈ").pair("ノ", "ﾉ").pair("ハ", "ﾊ").pair("ヒ", "ﾋ")
            .pair("フ", "ﾌ").pair("ヘ", "ﾍ").pair("ホ", "ﾎ").pair("マ", "ﾏ").pair(
                    "ミ", "ﾐ").pair("ム", "ﾑ").pair("メ", "ﾒ").pair("モ", "ﾓ")
            .pair("ヤ", "ﾔ").pair("ユ", "ﾕ").pair("ヨ", "ﾖ").pair("ラ", "ﾗ").pair(
                    "リ", "ﾘ").pair("ル", "ﾙ").pair("レ", "ﾚ").pair("ロ", "ﾛ")
            .pair("ワ", "ﾜ").pair("ヲ", "ｦ").pair("ン", "ﾝ").pair("ガ", "ｶﾞ").pair(
                    "ギ", "ｷﾞ").pair("グ", "ｸﾞ").pair("ゲ", "ｹﾞ").pair("ゴ", "ｺﾞ")
            .pair("ザ", "ｻﾞ").pair("ジ", "ｼﾞ").pair("ズ", "ｽﾞ").pair("ゼ", "ｾﾞ")
            .pair("ゾ", "ｿﾞ").pair("ダ", "ﾀﾞ").pair("ヂ", "ﾁﾞ").pair("ヅ", "ﾂﾞ")
            .pair("デ", "ﾃﾞ").pair("ド", "ﾄﾞ").pair("バ", "ﾊﾞ").pair("ビ", "ﾋﾞ")
            .pair("ブ", "ﾌﾞ").pair("べ", "ﾍﾞ").pair("ボ", "ﾎﾞ").pair("パ", "ﾊﾟ")
            .pair("ピ", "ﾋﾟ").pair("プ", "ﾌﾟ").pair("ペ", "ﾍﾟ").pair("ポ", "ﾎﾟ")
            .pair("ヴ", "ｳﾞ").pair("\u30f7", "ﾜﾞ").pair("\u30fa", "ｦﾞ").pair(
                    "゛", "ﾞ").pair("゜", "ﾟ").pair("　", " ").build());
}
